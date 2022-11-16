package YandexPraktikumTasks.JavaCore1.sprint_6.strings.task05;

public class Practicum {
    public static void main(String[] args) {
        FindRepeats check = new FindRepeats();
        int count = check.numberOfRepeats("раз, раз, раз", "раз");
        System.out.println(count);
    }
}