package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task01;

public class MountainHare {

    // добавьте переменные и конструктор
    private static String color;

    private int age;
    private double weight;
    private int jumpLength;

    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    public static void setColor(String color) {
        MountainHare.color = color;
    }

    public static String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getJumpLength() {
        return jumpLength;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}