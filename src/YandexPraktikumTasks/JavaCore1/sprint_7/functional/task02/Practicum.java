package YandexPraktikumTasks.JavaCore1.sprint_7.functional.task02;

import java.util.*;

public class Practicum {
    public static void main(String[] args) throws Exception {
        List<String> people = new ArrayList<>(List.of(
                "Мария Зуева",
                "Анна Дарк",
                "Кирилл Филимонов",
                "Ева Пинк"
        ));

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.substring(o1.lastIndexOf(" ")).length() - o2.substring(o2.lastIndexOf(" ")).length();
            }
        }; // <-- напишите свой код здесь

        Collections.sort(people, comparator);
        System.out.println(people);
    }
}