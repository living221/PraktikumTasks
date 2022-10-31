package YandexPraktikumTasks.JavaCore1.sprint_5.list.task01;

import java.util.Arrays;
import java.util.List;

public class Practicum {

    public static void main(String[] args) {

        final String[] coffeeArray = {"Латте", "Капучино", "Эспрессо"};

        for (String c : coffeeArray) {
            System.out.print(c + ", ");
        }
        System.out.println();

        final List<String> coffeeList = List.of(coffeeArray); // тут массив должен стать списком

        System.out.println(coffeeList);

        // создание и заполнение списка
        List<String> cities = Arrays.asList("Воронеж", "Южно-Сахалинск", "Иркутск");

        String[] citiesArray = cities.toArray(new String[]{}); // преобразование списка в массив

        System.out.println(cities); // напечатали список

        for (String city: citiesArray) { // напечатали массив
            System.out.print(city + ", ");
        }
    }
}
