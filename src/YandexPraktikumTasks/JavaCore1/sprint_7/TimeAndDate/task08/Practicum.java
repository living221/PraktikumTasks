package YandexPraktikumTasks.JavaCore1.sprint_7.TimeAndDate.task08;

import java.time.*;
import java.util.Arrays;
import java.util.List;

class Watch {
    private ZonedDateTime currentTime;
    private int numOfZone;
    private final List<String> zones = Arrays.asList("America/New_York", "Asia/Vladivostok", "Europe/Moscow");

    public Watch() {
        numOfZone = 0;
        ZoneId zone = ZoneId.of(zones.get(numOfZone));
        LocalDateTime dateTime = LocalDateTime.of(2021, 1, 26, 0, 0);
        currentTime = ZonedDateTime.of(dateTime, zone);
    }

    public void changeTimeZone() {
        numOfZone = (numOfZone + 1) % 3;
        ZoneId newZone = ZoneId.of(zones.get(numOfZone));
        // смените временную зону (время должно остаться прежним)
        currentTime = currentTime.withZoneSameLocal(newZone);
    }

    public void addTenHours() {
        // увеличьте текущее время на 10 часов
        currentTime = currentTime.plus(Duration.ofHours(10));
    }

    public void addHour() {
        // увеличьте текущее время на 1 час
        currentTime = currentTime.plus(Duration.ofHours(1));
    }

    public void addTenMinutes() {
        // увеличьте текущее время на 10 минут
        currentTime = currentTime.plus(Duration.ofMinutes(10));
    }

    public void addMinute() {
        // увеличьте текущее время на 1 минуту
        currentTime = currentTime.plus(Duration.ofMinutes(1));
    }

    public ZonedDateTime getCurrentTime() {
        // верните текущее время
        return currentTime;
    }
}

class Practicum {
    public static void main(String[] args) {
        Watch watch = new Watch();

        // настройка часов
        watch.changeTimeZone();
        watch.changeTimeZone();
        watch.addTenHours();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addTenMinutes();
        watch.addTenMinutes();

        watch.addMinute();
        watch.addMinute();
        watch.addMinute();
        watch.addMinute();
        watch.addMinute();
        watch.addMinute();
        System.out.println(watch.getCurrentTime());
    }
}