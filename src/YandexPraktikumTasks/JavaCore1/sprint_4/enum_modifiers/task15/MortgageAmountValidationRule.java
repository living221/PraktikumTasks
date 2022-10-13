package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task15;

// Дополните класс для проверки суммы ипотеки пользователя
public class MortgageAmountValidationRule extends ValidationRule<Integer> {

    public MortgageAmountValidationRule(Integer value) {
        super(value, "Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
    }

    // Объявите и реализуйте метод для проверки суммы ипотеки ниже
    @Override
    public boolean isValid() {
        if (value < 1_000_000 || value > 10_000_000) {
            return false;
        } else {
            return true;
        }
    }
}