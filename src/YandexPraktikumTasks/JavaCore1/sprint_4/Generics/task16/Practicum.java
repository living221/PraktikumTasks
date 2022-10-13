package YandexPraktikumTasks.JavaCore1.sprint_4.Generics.task16;

import java.util.ArrayList;
import java.util.List;

public class Practicum {

    public static void main(String[] args) {
        // Первый магазин продает дорогие товары и хочет передавать копейки типом Long
        List<Long> longList = new ArrayList<>();
        longList.add(Long.MAX_VALUE);

        new Printer<>(longList).print();

        // Второй магазин продает товары подешевле и использует для передачи копеек тип Integer
        List<Integer> intList = new ArrayList<>();
        intList.add(100000);

        new Printer<>(intList).print();

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");

        // Этот вариант должен вызывать ошибку компиляции
        //new Printer<>(stringList).print();
    }
}
