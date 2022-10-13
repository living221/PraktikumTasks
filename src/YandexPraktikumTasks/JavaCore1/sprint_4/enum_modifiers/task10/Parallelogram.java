package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task10;

public abstract class Parallelogram implements Figure {
    private final double a;
    private final double b;

    public Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }

}