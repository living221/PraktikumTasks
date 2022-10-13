package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task13;

import java.util.List;

public class Calculator {

    private Calculator() {
    }

    public static Double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double sum = 0D;
        for (MediaItem mediaItem : mediaItems) {
            if (mediaItem instanceof Movie) {
                sum += (mediaItem.getRuntime() / 1440D);
            } else if (mediaItem instanceof Series) {
                Series series = (Series) mediaItem;
                sum += (series.getSeriesCount() * series.getRuntime()) / 1440D;
            }

        }
        return sum;
    }
}
