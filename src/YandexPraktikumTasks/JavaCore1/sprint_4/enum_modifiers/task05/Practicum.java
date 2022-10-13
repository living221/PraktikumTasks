package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task05;

public class Practicum {

    public static String getPopulationPercent(Continent continent) {
        String result = switch (continent) {
            case ASIA -> "59.5%";
            case AFRICA -> "16.9%";
            case NORTH_AMERICA -> "7.7%";
            case SOUTH_AMERICA -> "5.6%";
            case ANTARCTICA -> "<0.1%";
            case EUROPE -> "9.7%";
            case AUSTRALIA -> "0.5%";
            default -> "Такого материка не существует.";
        };

        return result;
    }
}

enum Continent {
    ASIA,
    AFRICA,
    NORTH_AMERICA,
    SOUTH_AMERICA,
    ANTARCTICA,
    EUROPE,
    AUSTRALIA
}
