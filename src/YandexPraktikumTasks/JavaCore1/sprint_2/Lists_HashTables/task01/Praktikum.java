package YandexPraktikumTasks.JavaCore1.sprint_2.Lists_HashTables.task01;

import java.util.ArrayList;

public class Praktikum {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("шиншилла");
        animals.add("крокодил");
        animals.add("лев");
        animals.add("медведь");
        animals.add("слон");


        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных:");
        System.out.println("Это будут:");
        for (String animal : animals) {
            System.out.println(animal);
        }
        System.out.println("Расписание кормлений:");
        System.out.println("В 9:00 - " + animals.get(1));
        System.out.println("В 10:00 - " + animals.get(4));
        System.out.println("В 11:00 - " + animals.get(0));
        System.out.println("В 12:00 - " + animals.get(2));
        System.out.println("В 13:00 - " + animals.get(3));
    }
}
