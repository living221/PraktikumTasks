package YandexPraktikumTasks.JavaCore1.sprint_3.OOP_incap_inher.task04.auto;

public class Automobile extends Transport {
    public Automobile() {
        wheelsNumber = 4;
    }

    protected String direction;

    public void turnTo(String worldSide) {
        direction = worldSide;
    }
}
