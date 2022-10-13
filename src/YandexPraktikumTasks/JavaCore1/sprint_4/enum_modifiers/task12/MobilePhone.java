package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task12;

public class MobilePhone extends Phone {


    public MobilePhone(String number) {
        super(number);
    }

    public final void sendSms(String targetNumber, String messageText) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}
