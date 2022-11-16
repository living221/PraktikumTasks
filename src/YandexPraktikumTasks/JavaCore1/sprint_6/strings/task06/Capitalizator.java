package YandexPraktikumTasks.JavaCore1.sprint_6.strings.task06;

public class Capitalizator {
    public String capitalize(String str) {
        return  str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
