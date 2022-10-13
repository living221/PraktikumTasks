package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task09;

public class Practicum {
    public static void main(String[] args) {
        CalendarApp noteBook = new CalendarApp();
        noteBook.addNote("Зайти в магазин после работы.");
        noteBook.addNote("Позвонить маме.");

        noteBook.deleteNote(0);
    }
}
