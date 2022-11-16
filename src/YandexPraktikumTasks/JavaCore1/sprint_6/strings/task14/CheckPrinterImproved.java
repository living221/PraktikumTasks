package YandexPraktikumTasks.JavaCore1.sprint_6.strings.task14;

import java.util.ArrayList;

public class CheckPrinterImproved {

    private int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public void printCheck(String[] items) {

        String[] titles = new String[items.length];
        String[] quantities = new String[items.length];
        String[] prices = new String[items.length];

        for (int i = 0; i < items.length; i++) {
            String[] parts = items[i].split(", ");
            titles[i] = parts[0];
            quantities[i] = parts[1];
            prices[i] = parts[2];
        }

        int longestTitle = findMaxLength(titles);
        int longestQuantity = findMaxLength(quantities);
        int longestPrice = findMaxLength(prices);

        for (int i = 0; i < titles.length; i++) {

            String checkString = String.format("%-" + longestTitle + "s" + "  "
                    + "%-" + longestQuantity + "s" + "  "
                    + "%-" + longestPrice + "s", titles[i], quantities[i], prices[i] );

            System.out.println(checkString);
        }

    }

    public static void main(String[] args) {
        CheckPrinterImproved checkPrinterImproved = new CheckPrinterImproved();

        String[] strings = {"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"};

        checkPrinterImproved.printCheck(strings);
    }
}