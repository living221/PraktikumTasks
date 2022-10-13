package YandexPraktikumTasks.JavaCore1.sprint_4.Generics.task18;

// Дополните объявление класса Contact
public abstract class Contact {
    // Класс должен содержать одно поля - имя пользователя name
    String name;

    public Contact(String name) {
        this.name = name;
    }

    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
    abstract void sendMessage();

    abstract void print();

    public String getName() {
        return this.name;
    }
}
