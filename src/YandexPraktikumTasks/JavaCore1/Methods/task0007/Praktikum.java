package YandexPraktikumTasks.JavaCore1.Methods.task0007;

public class Praktikum {

    public static void main(String[] args) {
        double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
        double maxExpense = findMaxExpense(expenses); // Вызовите метод и присвойте maxExpense значение его результата
        System.out.println("Самая большая трата недели " + maxExpense);
    }

	public static double findMaxExpense(double[] expenses) {
        double result = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > result) {
                result = expenses[i];
            }
        }
        return result;
    }
}
