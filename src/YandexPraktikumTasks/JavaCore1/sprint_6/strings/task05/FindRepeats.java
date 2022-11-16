package YandexPraktikumTasks.JavaCore1.sprint_6.strings.task05;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {

        int result = 0;
        while (text.contains(substring)) {
            result++;
            text = text.substring(text.indexOf(substring) + substring.length());
        }
        return result;
    }
}