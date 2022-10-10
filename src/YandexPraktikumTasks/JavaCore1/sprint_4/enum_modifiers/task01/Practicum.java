package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task01;

import java.util.List;

public class Practicum {

    public static void main(String[] args) {
        List<MountainHare> hares = List.of(
                new MountainHare(4, 4.4, 120),
                new MountainHare(7, 3.6, 150),
                new MountainHare(1, 2.3, 100)
        );

        System.out.println("В лесу лето!");
        // создайте объект "летний лес с зайцами"
        Forest forest = new Forest(hares);
        Forest.setSeason("лето");

        System.out.println("Список зайцев:");
        // напечатайте список всех зайцев
        forest.printHares();
        System.out.println("В лесу зима!");
        // поменяйте время года на зиму
        Forest.setSeason("зима");
        System.out.println("Список зайцев:");
        // напечатайте список всех зайцев
        forest.printHares();
    }

}