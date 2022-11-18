package YandexPraktikumTasks.JavaCore1.sprint_6.exceptions.task03;

// допишите код UserInputException

public class Practicum {
    public static void main(final String[] args) {
        final UserInputException userInputException = new UserInputException("Ошибка ввода!");
        System.out.println(userInputException.getMessage());
    }

    private static class UserInputException extends Exception {
        public UserInputException() {

        }

        public UserInputException(final String message) {
            super(message);
        }
    }
}