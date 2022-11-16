package YandexPraktikumTasks.JavaCore1.sprint_6.strings.task12;

public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        StringBuilder sb = new StringBuilder();
        for (String s : grades) {
            String[] parts = s.split(" ");
            sb.append(parts[0]);
            sb.append(",");
            sb.append(parts[1]);
            sb.append(",");
            sb.append(parts[2]);
            sb.append(",");
            sb.append(gradeStringToInt(parts[4]));
            sb.append(";");
        }
        return sb.toString();
    }

}
