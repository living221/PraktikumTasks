package YandexPraktikumTasks.JavaCore1.Sprint_2.Operations.task07;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой год вы хотите проверить?");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 400 == 0)  || (year % 4 == 0) && (year % 100 !=0); // Составьте логическое выражение
        if (isLeapYear) {
            System.out.println("Согласно григорианскому календарю, этот год - високосный!");
        } else {
            System.out.println("Согласно григорианскому календарю, этот год - не високосный!");
        }
    }
}
