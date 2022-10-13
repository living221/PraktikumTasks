package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task12;

// Допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone {


    public Smartphone(String number) {
        super(number);
    }

    public final void makeCall(String targetNumber, String appName) {
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
        super.makeCall(targetNumber);
    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

}