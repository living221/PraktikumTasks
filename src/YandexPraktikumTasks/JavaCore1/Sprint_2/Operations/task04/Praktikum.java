package YandexPraktikumTasks.JavaCore1.Sprint_2.Operations.task04;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        while (true) {
            System.out.println("Когда планируется путешествие? Введите номер месяца от 1 до 12.");
            monthNumber = scanner.nextInt();

            if (!(monthNumber > 12)) { // Инвертируйте условие
                break;
            } else {
                System.out.println("Некорректный номер месяца. Введите ещё раз.");
            }
        }
        String season = getSeasonByNumber(monthNumber);

        if (season.equals("Лето"))/* Допишите ветвление, которое будет печатать строку:
            System.out.println("Летом лучше остаться в Москве.");
              и завершать выполнение программы */
        {
            System.out.println("Летом лучше остаться в Москве.");
            return;
        }


        System.out.println("Укажите стоимость прямых билетов из Москвы в Париж:");
        int ticketMoscowParis = scanner.nextInt();
        System.out.println("Укажите стоимость билетов из Москвы в Париж с пересадкой в Лондоне:");
        int ticketMoscowLondonParis = scanner.nextInt();
        System.out.println("У вас есть британская виза?");
        System.out.println("1 - да, виза есть");
        System.out.println("0 - визы нет");
        int britainVisa = scanner.nextInt();


        // В этом ветвлении что-то напутано с условиями - исправьте это
//        if (!season.equals("Лето")) { // Перенесите проверку на "Лето" в ветвление выше
            if (ticketMoscowLondonParis <= ticketMoscowParis) {
                if (britainVisa == 1) { // Упростите это условие
                    System.out.println("Летим через Лондон!");
                } else {
                    System.out.println("Летим напрямую в Париж!");
                }
            } else {
                System.out.println("Летим напрямую в Париж!");
            }
//        }
    }

    private static String getSeasonByNumber(int monthNumber) {
        // Допишите условия ветвления в виде утверждений
        if (monthNumber <= 2) {
            return "Зима";
        } else if (monthNumber <= 5) {
            return "Весна";
        } else if (monthNumber <= 8) {
            return "Лето";
        } else if (monthNumber <= 11) {
            return "Осень";
        } else {
            return "Зима";
        }
    }
}