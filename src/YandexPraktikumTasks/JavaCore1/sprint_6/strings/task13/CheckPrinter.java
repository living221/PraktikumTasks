package YandexPraktikumTasks.JavaCore1.sprint_6.strings.task13;

public class CheckPrinter {
    public void printCheck(String[] items) {
        for (String item: items) {
            String[] parts = item.split(", ");
            for (String str : parts) {
                System.out.printf("%-10s", str);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CheckPrinter checkPrinter = new CheckPrinter();
        String[] goods = new String[]{"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"};

        checkPrinter.printCheck(goods);
    }
}
