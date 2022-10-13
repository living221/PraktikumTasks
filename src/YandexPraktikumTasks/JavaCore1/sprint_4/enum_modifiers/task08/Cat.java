package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task08;

public class Cat extends Pet {
    public Cat() {
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("мяу");
    }

    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }
}
