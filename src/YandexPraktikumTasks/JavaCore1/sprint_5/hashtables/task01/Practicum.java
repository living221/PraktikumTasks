package YandexPraktikumTasks.JavaCore1.sprint_5.hashtables.task01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practicum {
    // Пример списка пассажиров (на самом деле их больше)
    private static List<String> passengerNames = List.of(
            "Василий Петров",
            "Анна Ягирская",
            "Виктория Сотова",
            "Игорь Серов",
            "Людмила Ульянова"
    );

    public static void main(String[] args) {
        Map<String, Integer> seats = assignSeats(passengerNames);
        System.out.println("Места пассажиров: " + seats);
    }

    public static Map<String, Integer> assignSeats(List<String> passengerNames) {
        // Тут нужно написать код, который будет распределять места в самолёте ✈️
        Map <String, Integer> map = new HashMap<>();

        for (int i = 0; i < passengerNames.size(); i++) {
            map.put(passengerNames.get(i), i + 1 );
        }

        return map;
    }
}