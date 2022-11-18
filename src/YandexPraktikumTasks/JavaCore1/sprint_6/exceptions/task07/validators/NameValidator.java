package YandexPraktikumTasks.JavaCore1.sprint_6.exceptions.task07.validators;

//package validators;

import YandexPraktikumTasks.JavaCore1.sprint_6.exceptions.task07.exceptions.ValidateException;
import YandexPraktikumTasks.JavaCore1.sprint_6.exceptions.task07.exceptions.ValidateNameException;

public class NameValidator implements Validator {
    @Override
    public void validate(String value) throws ValidateException {
        if (value == null || value.isEmpty()) {
            throw new ValidateNameException("Имя не должно быть пустым");
        }
    }
// допишите код класса
}