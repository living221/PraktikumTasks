package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task07;

public class FlyingDuck extends Duck {
    @Override
    public String getName() {
        return "Я - обычная утка. Кря!";
    }

    public void fly() {
        System.out.println("Лечу куда хочу.");
    }

    public void eat() {
        System.out.println("Обычно кушаю разные семена, но иногда нахожу хлебушек.");
    }
}
