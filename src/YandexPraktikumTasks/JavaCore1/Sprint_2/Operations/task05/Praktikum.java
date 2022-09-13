package YandexPraktikumTasks.JavaCore1.Sprint_2.Operations.task05;

public class Praktikum {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Яндекс.Практикум");
            } else if (i % 3 == 0) {
                System.out.println("Яндекс");
            } else if (i % 5 == 0) {
                System.out.println("Практикум");
            } else {
                System.out.println(i);
            }
        }
    }
}