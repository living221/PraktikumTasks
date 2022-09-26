package YandexPraktikumTasks.JavaCore1.sprint_2.Lists_HashTables.task09;

import java.util.ArrayList;
import java.util.HashMap;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories;

    ExpensesManager() {
        expensesByCategories = new HashMap<>();
    }

    // Добавьте в метод ещё один параметр — category
    double saveExpense(double moneyBeforeSalary, double expense, String category) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        // Замените на работу с таблицей
        ArrayList<Double> categoryExpenses;// Создайте новый список трат и добавьте в него сумму
        // Сохраните категорию и новый список трат в хеш-таблицу
        if (expensesByCategories.containsKey(category)) { // Проверьте наличие категории
            categoryExpenses = expensesByCategories.get(category);
        } else {
            categoryExpenses = new ArrayList<>();
        }
        categoryExpenses.add(expense);
        expensesByCategories.put(category, categoryExpenses);// Добавьте трату
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }


    void printAllExpensesByCategories() {
        // Замените логику для работы с таблицами
        for (String category : expensesByCategories.keySet()) {
            System.out.println(category);
            for (Double expense : expensesByCategories.get(category)) {
                System.out.println(expense);
            }
        }
    }

    // Метод должен принимать название категории и называться findMaxExpenseInCategory
    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        /* Замените логику для работы с таблицами
        Если категория есть, то ищем максмальную трату.
        Иначе печатаем "Такой категории пока нет." */

        if (expensesByCategories.containsKey(category)) {
            for (Double expense : expensesByCategories.get(category)) {
                if (expense > maxExpense) {
                    maxExpense = expense;
                }
            }
        } else {
            System.out.println("Такой категории пока нет.");
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear(); // Таблица называется иначе
        System.out.println("Траты удалены.");
    }
}
