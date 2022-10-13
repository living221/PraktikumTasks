package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task08;

public abstract class Pet {
    int pawsCount;

    public Pet(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public void sleep() {
        System.out.println("Сплю");
    }

    public void play() {
        System.out.println("Играю");
    }

    public abstract void giveVoice();

    public int getPawsCount() {
        return pawsCount;
    }
}
