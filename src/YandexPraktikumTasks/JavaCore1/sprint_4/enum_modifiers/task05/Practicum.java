package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task05;

public class Practicum {

    public static String getPopulationPercent(Continent continent) {
        String result;
        switch (continent) {
            case ASIA:
                result = "59.5%";
                break;
            case AFRICA:
                result = "16.9%";
                break;
            case NORTH_AMERICA:
                result = "7.7%";
                break;
            case SOUTH_AMERICA:
                result = "5.6%";
                break;
            case ANTARCTICA:
                result = "<0.1%";
                break;
            case EUROPE:
                result = "9.7%";
                break;
            case AUSTRALIA:
                result = "0.5%";
                break;
            default:
                result = "Такого материка не существует.";
                break;
        }

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
