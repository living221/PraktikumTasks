package YandexPraktikumTasks.JavaCore1.sprint_7.functional.task15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practicum {

    public static void main(String[] args) {
        long count = Stream.of("фильм «Компиляторы-убийцы»", "сериал «Спринг»", "сериал «Алгоритмы»", "фильм «Матрица: двумерный обход»")
                .count();
        System.out.println(count);

        boolean isAllUppercased = Stream.of("фильм «Компиляторы-убийцы»", "сериал «Спринг»", "сериал «Алгоритмы»", "фильм «Матрица: двумерный обход»")
                .allMatch(title -> title.startsWith("фильм"));
        System.out.println("Сегодня показывают только фильмы? " + isAllUppercased);

        boolean found = Stream.of("фильм «Компиляторы-убийцы»", "сериал «Спринг»", "сериал «Алгоритмы»", "фильм «Матрица: двумерный обход»")
                .anyMatch(title -> title.toLowerCase().contains("спринг"));
        System.out.println("Есть ли что-то про спринг? " + found);

        Optional<String> maybeFound = Stream.of("фильм «Компиляторы-убийцы»", "сериал «Спринг»", "сериал «Алгоритмы»", "фильм «Матрица: двумерный обход»")
                .findFirst();

        if (maybeFound.isPresent()) {
            System.out.println("Сериал найден: " + maybeFound.get());
        } else {
            System.out.println("Сериалов в программе нет. :(");
        }

        // собрали в одну строку, объединили через -
        String text = Stream.of("фильм «Компиляторы-убийцы»", "сериал «Спринг»", "сериал «Алгоритмы»", "фильм «Матрица: двумерный обход»")
                .collect(Collectors.joining(" // ")); // разделитель
        System.out.println("Текстом: " + text);

        // собрали в список
        List<String> collected = Stream.of("фильм «Компиляторы-убийцы»", "сериал «Спринг»", "сериал «Алгоритмы»", "фильм «Матрица: двумерный обход»")
                .collect(Collectors.toList());
        System.out.println("Списком: " + collected);

        Stream.of("фильм «Компиляторы-убийцы»", "сериал «Спринг»", "сериал «Алгоритмы»", "фильм «Матрица: двумерный обход»")
                .filter(title -> title.contains("сериал"))
                .forEach(System.out::println);

        Map<String, Integer> ratings = new HashMap<>();
        ratings.put("фильм «Компиляторы-убийцы»", 3);
        ratings.put("сериал «Спринг»", 5);
        ratings.put("сериал «Алгоритмы»", 4);
        ratings.put("фильм «Матрица: двумерный обход»", 5);

        Stream.of("фильм «Компиляторы-убийцы»", "сериал «Спринг»", "сериал «Алгоритмы»", "фильм «Матрица: двумерный обход»")
                .map(ratings::get)
                .forEach(System.out::println);

        Stream.of("ПРОРЫВ В ЭКОНОМИКЕ", "ЛУЧШЕЕ ДЕТЯМ", "ЛУЧШЕЕ В ЭКОНОМИКЕ")
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .forEach(System.out::println);

        Stream.of("Пирамиды", "Эверест", "Колизей")
                .limit(2)
                .forEach(System.out::println);

        Stream.of("Надя", "Ольга", "Марат", "Света", "Ева")
                .map(String::length)
                .filter(len -> len == 5)
                .limit(2)
                .forEach(System.out::println);

        Stream<Integer> names = Stream.of("Надя", "Ольга", "Марат", "Света", "Ева")
                .map(String::length)
                .distinct();
        names.forEach(System.out::println);
    }
}