package YandexPraktikumTasks.JavaCore1.sprint_7.functional.task11;

import java.util.*;

public class Practicum {

    public static String longestName(List<String> names) {
        if (names.isEmpty()) {
            return null;
        }
        String max = names.get(0);
        for (String name : names) {
            if (name.length() > max.length()) {
                max = name;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        String longest = longestName(names);
        if (longest != null) {
            System.out.println("Самое длинное имя состоит из " + longest.length() + " символов.");
        } else {
            System.out.println("Такого имени нет.");
        }
    }
}