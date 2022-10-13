package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task08;

public class Hamster extends Pet {
    protected Hamster() {
        super(4);
    }

    @Override
    public void giveVoice() {

    }

    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }
}
