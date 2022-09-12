package YandexPraktikumTasks.JavaCore1.Sprint_2.Types.task03;

class WeatherCalendar {
    String month;
    int numberOfDays;
    int rainyDays;
    int year = 2020;
    boolean isRainyMonth;

    public WeatherCalendar(String month, int numberOfDays) {
        this.month = month;
        this.numberOfDays = numberOfDays;
    }

    // Увеличить переменную rainyDays на единицу
    public void addRainyDay() {
            rainyDays++;
    }
}