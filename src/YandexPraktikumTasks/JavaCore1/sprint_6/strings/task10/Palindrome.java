package YandexPraktikumTasks.JavaCore1.sprint_6.strings.task10;

public class Palindrome {

    public static boolean isPalindromeWord(String str) {
        String testString = str.replaceAll(" ", "").toLowerCase();
        StringBuilder builder = new StringBuilder(testString);
        return builder.reverse().toString().equals(testString);
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeWord("  a   asd"));
    }
}
