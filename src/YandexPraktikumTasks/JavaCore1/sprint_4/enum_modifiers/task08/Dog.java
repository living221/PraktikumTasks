package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task08;

public class Dog extends Pet {
    protected Dog() {
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("гав");
    }

    public void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}
