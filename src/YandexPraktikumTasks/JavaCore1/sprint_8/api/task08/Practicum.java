package YandexPraktikumTasks.JavaCore1.sprint_8.api.task08;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Practicum {
    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create();

        httpServer.bind(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.start();
        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
//        httpServer.stop(1);
    }

    static class HelloHandler implements HttpHandler {

        private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            String response = "";

            // извлеките метод из запроса
            String method = httpExchange.getRequestMethod();

            switch (method) {
                // сформируйте ответ в случае, если был вызван POST-метод
                case "GET": {
                    response = "Здравствуйте!";
                    break;
                }
                case "POST": {
                    // извлеките тело запроса
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpExchange.getRequestBody()));
                    String body = bufferedReader.readLine();

                    // извлеките path из запроса
                    String path = httpExchange.getRequestURI().getPath();
                    // а из path — профессию и имя
                    String profession = path.split("/")[2];
                    String name = path.split("/")[3];

                    // извлеките заголовок
                    List<String> wishGoodDay = httpExchange.getRequestHeaders().get("X-Wish-Good-Day");
                    if ((wishGoodDay != null) && (wishGoodDay.contains("true"))) {
                        response = body + ", " + profession + " " + name + "!";
                    }
                    break;
                    // соберите ответ

                    // не забудьте про ответ для остальных методов
                }
                default: {
                    response = "Некорректный метод!";
                }
            }

            httpExchange.sendResponseHeaders(200, 0);
            try (OutputStream os = httpExchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }
}