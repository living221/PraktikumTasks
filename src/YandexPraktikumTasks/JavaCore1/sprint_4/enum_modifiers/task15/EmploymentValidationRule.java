package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task15;

// Дополните класс для проверки трудоустроенности пользователя
public class EmploymentValidationRule extends ValidationRule<Boolean> {

    public EmploymentValidationRule(Boolean value) {
        super(value, "Ипотека выдается только трудоустроенным");
    }

    @Override
    public boolean isValid() {
        return value;
    }
}