package YandexPraktikumTasks.JavaCore1.sprint_6.exceptions.task04;

public class LimitException extends RuntimeException {
    private final int attempts;
    public LimitException(final String message, final int attempts) {
        super(message);
        this.attempts = attempts;
    }

    public String getDetailMessage() {
        return getMessage() + ": " + attempts;
    }
}
