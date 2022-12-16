package YandexPraktikumTasks.JavaCore1.sprint_8.net_requests.task03;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Practicum {
    public static void main(String[] args) {
        int requestedStatus = 200;
        // используем код состояния как часть URL-адреса
        URI uri = URI.create("http://httpbin.org/status/" + requestedStatus);
        HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build();

        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // обработайте указанные в задании коды состояния

            int status = response.statusCode();
            // обрабатываем коды успешного состояния
            // обрабатываем коды состояния, говорящие об ошибке на стороне клиента
            switch (status) {
                case 400:
                    System.out.println("В запросе содержится ошибка. Проверьте параметры и повторите запрос.");
                    break;
                case 404:
                    System.out.println("По указанному адресу нет ресурса. Проверьте URL-адрес ресурса и повторите запрос.");
                    break;

                // обрабатываем коды состояния, говорящие об ошибке на стороне сервера
                case 500:
                    System.out.println("На стороне сервера произошла непредвиденная ошибка.");
                    break;
                case 503:
                    System.out.println("Сервер временно недоступен. Попробуйте повторить запрос позже.");
                    break;
                default:  // обрабатываем остальные коды состояния
                    System.out.println(response.statusCode());
                    System.out.println(response.body());
                    break;
            }


        } catch (IOException | InterruptedException e) { // обрабатываем ошибки отправки запроса
            System.out.println("Во время выполнения запроса ресурса по url-адресу: '" + uri + "' возникла ошибка.\n" +
                    "Проверьте, пожалуйста, адрес и повторите попытку.");
        }
    }
}