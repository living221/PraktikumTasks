package YandexPraktikumTasks.JavaCore1.sprint_6.strings.task04;

public class SubstringFunctions {
    public boolean endsWith(String initial, String other) {
        return initial.lastIndexOf(other) == initial.length() - other.length();
    }
}