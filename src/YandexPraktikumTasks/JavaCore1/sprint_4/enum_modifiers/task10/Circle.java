package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task10;

public class Circle implements Figure {
    // Радиус круга
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}