package YandexPraktikumTasks.JavaCore1.sprint_6.exceptions.task07.validators;

//package validators;

import YandexPraktikumTasks.JavaCore1.sprint_6.exceptions.task07.exceptions.ValidateException;
//import exceptions.ValidateException;

public interface Validator {
    void validate(String value) throws ValidateException;
}