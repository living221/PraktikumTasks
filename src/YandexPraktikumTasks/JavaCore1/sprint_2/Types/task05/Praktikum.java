package YandexPraktikumTasks.JavaCore1.sprint_2.Types.task05;

public class Praktikum {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;
        int c = -7;
        Integer[] numbers = new Integer[3];

        // Сохраните в массив переменные a, b и с
        numbers[0] = a;
        numbers[1] = b;
        numbers[2] = c;
        // Напечатайте все элементы
        System.out.println("Сейчас в массиве числа: " + numbers[0] + ","
                + numbers[1] + "," + numbers[2]);
    }
}