package YandexPraktikumTasks.JavaCore1.Methods.task0001;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v1.0.");
    }

    public static void welcomeUserByName() { // Объявите ниже метод welcomeUserByName
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine(); // Сохраните введённое пользователем имя в переменную name
        System.out.println("Рад познакомиться, " + name + "!");
    }

    public static void sayHelloByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();

        if (currentHour < 6) {
            System.out.println("Доброй ночи!");
        } else if (currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour < 18) {
            System.out.println("Добрый день!");
        } else if (currentHour < 22) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Доброй ночи!");
        }
    }
}