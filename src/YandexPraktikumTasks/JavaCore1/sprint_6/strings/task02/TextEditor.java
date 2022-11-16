package YandexPraktikumTasks.JavaCore1.sprint_6.strings.task02;

public class TextEditor {

    private boolean isCapsLock = false;

    public void capsLock() {
        // Здесь нужно изменить значение флага isCapsLock на противоположное
        if (isCapsLock) {
            isCapsLock = false;
        } else {
            isCapsLock = true;
        }
    }

    public void print(String str) {
        // А здесь распечатать строку в верхнем или нижнем регистре с учётом флага
        if (isCapsLock) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
    }
}