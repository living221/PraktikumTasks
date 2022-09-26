package YandexPraktikumTasks.JavaCore1.sprint_2.Lists_HashTables.task03;

import java.util.ArrayList; // Импортируйте ArrayList

public class ExpensesManager {

    ArrayList<Double> expenses;

    ExpensesManager() {
        expenses = new ArrayList<>(); // Создайте список в конструкторе
    }

    // Номер дня больше не нужен
    double saveExpense(double moneyBeforeSalary, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses.add(expense);
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + expenses.get(i) + " рублей");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (Double expense : expenses) {
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        return maxExpense;
    }
}