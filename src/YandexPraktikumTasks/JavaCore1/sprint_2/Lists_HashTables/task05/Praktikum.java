package YandexPraktikumTasks.JavaCore1.sprint_2.Lists_HashTables.task05;

import java.util.ArrayList;
import java.util.HashMap;

public class Praktikum {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();
        ArrayList<Integer> january = new ArrayList<>();
        ArrayList<Integer> february = new ArrayList<>();
        ArrayList<Integer> march = new ArrayList<>();
        ArrayList<Integer> may = new ArrayList<>();
        ArrayList<Integer> june = new ArrayList<>();
        ArrayList<Integer> november = new ArrayList<>();

        january.add(1);
        january.add(7);
        february.add(23);
        march.add(8);
        may.add(1);
        may.add(9);
        june.add(12);
        november.add(4);

        stateHolidays.put("Январь", january);
        stateHolidays.put("Февраль", february);
        stateHolidays.put("Март", march);
        stateHolidays.put("Май", may);
        stateHolidays.put("Июнь", june);
        stateHolidays.put("Ноябрь", november);

        System.out.println(stateHolidays);
    }
}