package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task01;

import java.util.List;

public class Forest {
    private List<MountainHare> hares;

    // объявите недостающие переменные и добавьте конструктор
    private static String season;

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }

    public List<MountainHare> getHares() {
        return hares;
    }

    public void setHares(List<MountainHare> hares) {
        this.hares = hares;
    }

    public static String getSeason() {
        return season;
    }

    // добавьте метод setSeason(String newSeason)
    public static void setSeason(String newSeason) {
        if (newSeason.equals("зима")) {
            season = newSeason;
            MountainHare.setColor("белый");
        } else {
            season = newSeason;
            MountainHare.setColor("серо-рыжий");
        }
    }
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    // добавьте метод printHares()
    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }

}