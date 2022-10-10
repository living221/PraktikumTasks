package YandexPraktikumTasks.JavaCore1.sprint_3.Object_class.task01;

import java.util.ArrayList;
import java.util.List;

public class LostAndFoundOffice {
    // создайте список things
    ArrayList<Object> things = new ArrayList<>();

    public void put(Object o) {
        things.add(o);
    }

    public boolean check(Object target) {
        for (Object object : things) {
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}