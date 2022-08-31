package YandexPraktikumTasks.JavaCore1.Methods.task0010;

public class Praktikum {

    public static void main(String[] args) {
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};
        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};

        sayHello("Пиксель");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesCat));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesCat));
        sayEnjoyMeal("Пиксель");

        sayHello("Байт");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesHamster));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesHamster));
        sayEnjoyMeal("Байт");
    }

    public static double findExpensesSum(double[] feedExpensesCat) {
        double sumFeedCat = 0;
        for (int i = 0; i < feedExpensesCat.length; i++) {
            sumFeedCat = sumFeedCat + feedExpensesCat[i];
        }
        return sumFeedCat;
    }

    public static double findMaxExpense(double[] feedExpensesCat) {
        double maxFeedExpenseCat = 0;
        for (int i = 0; i < feedExpensesCat.length; i++) {
            if (feedExpensesCat[i] > maxFeedExpenseCat) {
                maxFeedExpenseCat = feedExpensesCat[i];
            }
        }
        return maxFeedExpenseCat;
    }

    public static void sayEnjoyMeal(String name) {
        System.out.println("Приятного аппетита, " + name + "!");
    }

    public static void sayHello(String name) {
        System.out.println("Привет, " + name + "!");
    }
}
