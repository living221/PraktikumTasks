package YandexPraktikumTasks.JavaCore1.sprint_6.exceptions.task07.validators;

//package validators;

import YandexPraktikumTasks.JavaCore1.sprint_6.exceptions.task07.exceptions.ValidateException;
import YandexPraktikumTasks.JavaCore1.sprint_6.exceptions.task07.exceptions.ValidatePasswordException;
//import exceptions.ValidateException;
//import exceptions.ValidatePasswordException;

public class PasswordLengthValidator implements Validator {
    private final int minLength;

    public PasswordLengthValidator(final int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void validate(final String password) throws ValidateException {
        if (password == null || password.length() < minLength) {
            throw new ValidatePasswordException(
                    String.format("Пароль должен быть больше %d символов", minLength)
            );
        }
    }
}