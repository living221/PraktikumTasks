package YandexPraktikumTasks.JavaCore1.sprint_7.functional.task13;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Команда археологов попросила вас помочь с анализом найденных артефактов.
Часть из них — книги, которые сохранились целиком.
Другая часть — фрагменты повреждённых табличек, каждая из которых предположительно цитирует какую-то из книг.
Все материалы были оцифрованы. Книги представлены в виде строки String, которая состоит из слов и пробелов.
Каждая табличка представлена в виде списка Optional<String>,
где элементы — либо конкретное слово, либо Optional.empty(),
если слово отсутствует (разобрать некоторые слова на табличках было невозможно).
Ваша задача — найти фрагмент книги, которую цитирует табличка, и вывести его на экран.
 */

public class Practicum {

    public static Optional<String> find(String text, List<Optional<String>> maybeWords) {
        String[] words = text.toLowerCase().split("\\P{IsAlphabetic}+"); // разбиение на слова
        for (int start = 0; start <= words.length - maybeWords.size(); start++) {
            boolean misMatch = false;
            for (int i = 0; i < maybeWords.size(); i++) {
                Optional<String> maybeWord = maybeWords.get(i);
                if (maybeWord.isPresent() && !maybeWord.get().equals(words[start + i])) {
                    misMatch = true;
                    break;
                }
            }
            if (!misMatch) {
                StringBuilder answer = new StringBuilder();
                for (int i = 0; i < maybeWords.size(); i++) {
                    answer.append(words[start + i]).append(" ");
                }
                return Optional.of(answer.toString().strip());
            }
        }
        return Optional.empty();
    }

    public static void findInBooks(List<String> books, List<Optional<String>> maybeWords) {
        for (String text : books) {
            find(text, maybeWords).ifPresent(System.out::println);
        }
    }

    public static void main(String[] args) {
        List<String> books = Arrays.asList(
                "Фараон желает доброе утро! Доброе утро всем читающим эти строки!",
                "Солнце печёт людей; бабушка печёт пирожки; печь греет дом",
                "Наскальная живопись может приглянуться всем, особенно может всем запомниться"
        );


        findInBooks(
                books,
                List.of(Optional.of("доброе"), Optional.empty(), Optional.of("всем"))
        ); // "доброе утро всем"

        findInBooks(
                books,
                List.of(Optional.of("доброе"), Optional.empty(), Optional.empty(), Optional.of("всем"))
        ); // empty

        findInBooks(
                books,
                List.of(Optional.empty(), Optional.of("печёт"), Optional.of("пирожки"))
        ); // "бабушка печёт пирожки"

        findInBooks(
                books,
                List.of(Optional.of("может"), Optional.of("всем"), Optional.empty())
        ); // "может всем запомниться"
    }
}