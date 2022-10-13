package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task11;

public class Practicum {

    public static void main(String[] args) {
        Printer printer = new Printer();
        // Будет выбран метод, принимающий тип int
        printer.print(10);
        // Будет выбран метод, принимающий тип String
        printer.print("Привет!");
        // Будет выбран метод, принимающий тип Object
        printer.print(printer);

        printer.print(100L);
    }

}
