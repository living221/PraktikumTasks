package YandexPraktikumTasks.JavaCore1.sprint_5.list.task06;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime dt1, DateTime dt2) {

        return ((Integer.compare(dt1.year, dt2.year))
                + (Integer.compare(dt1.month, dt2.month))
                + (Integer.compare(dt1.day, dt2.day))
                + (Integer.compare(dt1.hours, dt2.hours))
                + (Integer.compare(dt1.minutes, dt2.minutes))
                + (Integer.compare(dt1.seconds, dt2.seconds)));
    }
}