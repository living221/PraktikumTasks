package YandexPraktikumTasks.JavaCore1.sprint_6.strings.task01;

public class CleanInput {
    public String fixString(String str) {
        if (str.isEmpty() || str.isBlank()) {
            return "Вы ничего не ввели!";
        } else {
            return str.trim();
        }
    }
}