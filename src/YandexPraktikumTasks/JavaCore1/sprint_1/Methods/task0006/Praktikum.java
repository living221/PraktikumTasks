package YandexPraktikumTasks.JavaCore1.sprint_1.Methods.task0006;

public class Praktikum {
    public static void main(String[] args) {
        System.out.println("Наибольшее из чисел 3 и 5 = " + findMax(3, 5));
        // Напишите аналогичный вызов метода findMax для таких пар чисел: 16 и 5, -1 и -7
        System.out.println("Наибольшее из чисел 16 и 5 = " + findMax(16, 5));
        System.out.println("Наибольшее из чисел -1 и -7 = " + findMax(-1, -7));
    }
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}
