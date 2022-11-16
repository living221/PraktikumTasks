package YandexPraktikumTasks.JavaCore1.sprint_6.strings.task11;

public class Grades {

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {

        String[] strings = grades.split(";");
        for (String s : strings) {
            String[] data = s.split(",");
            StringBuilder sb = new StringBuilder();
            sb.append(capitalize(data[0]));
            sb.append(" ");
            sb.append(capitalize(data[1]));
            sb.append(" ");
            sb.append(data[2].toLowerCase());
            sb.append(" — ");
            sb.append(gradeToString(data[3]));
            System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        String test = "вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5";

        grades.gradeBeautifier(test);
    }
}