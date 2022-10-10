package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task03;

public class TransactionValidator {
    private static final int MIN_AMOUNT = 1;
    private static final int MAX_AMOUNT = 5000;

    public static boolean isValidAmount(int amount) {
        if (amount < MIN_AMOUNT ) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        } else if (amount > MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        } else return true;
    }
    // объявите константы

    // объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода


}