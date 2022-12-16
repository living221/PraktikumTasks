package YandexPraktikumTasks.JavaCore1.sprint_8.net_requests.task07;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Converter {
    double rateUSD;
    double rateEUR;
    double rateJPY;

    private HttpClient client;

    public Converter() {
        client = HttpClient.newHttpClient();
    }

    public void convert(double rubles, int currency) {
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + rubles * getRate("USD"));
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + rubles * getRate("EUR"));
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " + rubles * getRate("JPY"));
        } else {
            System.out.println("Неизвестная валюта");
        }
    }

    private double getRate(String currency) {
        URI url = URI.create("https://api.exchangerate.host/latest?base=RUB&symbols=" + currency);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // проверяем, успешно ли обработан запрос
            if (response.statusCode() == 200) {
                JsonElement jsonElement = JsonParser.parseString(response.body());
                if (!jsonElement.isJsonObject()) { // проверяем, точно ли мы получили JSON-объект
                    System.out.println("Ответ от сервера не соответствует ожидаемому.");
                    return -1;
                }
                // получите курс доллара и евро и запишите в переменные rateUSD и rateEUR
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                JsonObject rates = jsonObject.get("rates").getAsJsonObject();
                return rates.get(currency).getAsDouble();
            } else {
                System.out.println("Что-то пошло не так. Сервер вернул код состояния: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) { // обрабатываем ошибки отправки запроса
            System.out.println("Во время выполнения запроса возникла ошибка.\n" +
                    "Проверьте, пожалуйста, адрес и повторите попытку.");
        }
        return -1;
    }
}