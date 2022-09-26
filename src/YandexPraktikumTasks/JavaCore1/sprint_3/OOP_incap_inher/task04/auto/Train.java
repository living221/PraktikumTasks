package YandexPraktikumTasks.JavaCore1.sprint_3.OOP_incap_inher.task04.auto;

public class Train extends Transport {
    public Train() {
        wheelsNumber = 8;
    }

    private boolean isLocomotive;

    public void turnToLocomotive() {
        isLocomotive = true;
    }

    public void turnToCarriage() {
        isLocomotive = false;
    }
}
