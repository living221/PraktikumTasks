package YandexPraktikumTasks.JavaCore1.sprint_6.strings.task09;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        StringBuilder builder = new StringBuilder(text);

        while (builder.indexOf(substring) != -1) {
            count++;
            builder.delete(builder.indexOf(substring), substring.length());
        }
        return count;
    }
}
