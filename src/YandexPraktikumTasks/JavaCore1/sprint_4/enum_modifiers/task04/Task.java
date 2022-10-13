package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task04;

public class Task {

    private TaskPriority priority; // добавьте переменную priority с приоритетом задачи
    private String description;

    public Task(TaskPriority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    // добавьте конструктор класса

    public TaskPriority getPriority() {
        return priority;
    }

    // добавьте метод get для приоритета

    public String getDescription() {
        return description;
    }
}