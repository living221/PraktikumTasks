package YandexPraktikumTasks.JavaCore1.sprint_8.api.task10;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Praktikum {
    private static final int PORT = 8080;
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    public static void main(String[] args) throws IOException {

        // добавьте код для конфигурирования и запуска сервера
        HttpServer httpServer = HttpServer.create();

        httpServer.bind(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/posts", new PostsHandler());
        httpServer.start();

        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
    }

    static class PostsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {

            // получите информацию об эндпоинте, к которому был запрос
            String requestPath = exchange.getRequestURI().getPath();
            String requestMethod = exchange.getRequestMethod();

            Endpoint endpoint = getEndpoint(requestPath, requestMethod);

            switch (endpoint) {
                case GET_POSTS: {
                    writeResponse(exchange, "Получен запрос на получение постов", 200);
                    break;
                }
                case GET_COMMENTS: {
                    writeResponse(exchange, "Получен запрос на получение комментариев", 200);
                    break;
                }
                case POST_COMMENT: {
                    writeResponse(exchange, "Получен запрос на добавление комментария", 200);
                    break;
                }
                default:
                    writeResponse(exchange, "Такого эндпоинта не существует", 404);
            }
        }

        private Endpoint getEndpoint(String requestPath, String requestMethod) {
            // реализуйте этот метод
            Endpoint endpoint = Endpoint.UNKNOWN;
            switch (requestMethod) {
                case "GET": {
                    if (requestPath != null && requestPath.endsWith("posts")) {
                        endpoint = Endpoint.GET_POSTS;
                    }
                    if (requestPath != null && requestPath.contains("comments")) {
                        endpoint = Endpoint.GET_COMMENTS;
                    }
                    break;
                }
                case "POST": {
                    endpoint = Endpoint.POST_COMMENT;
                    break;
                }
            }
            return endpoint;
        }

        private void writeResponse(HttpExchange exchange,
                                   String responseString,
                                   int responseCode) throws IOException {
            /* Реализуйте отправку ответа, который содержит responseString в качестве тела ответа
            и responseCode в качестве кода ответа.
            Учтите, что если responseString — пустая строка, то её не нужно передавать в ответе. */
            exchange.sendResponseHeaders(responseCode, 0);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(responseString.getBytes());
            }
        }

        enum Endpoint {GET_POSTS, GET_COMMENTS, POST_COMMENT, UNKNOWN}
    }
}