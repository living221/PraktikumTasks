package YandexPraktikumTasks.JavaCore1.sprint_6.exceptions.task01;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        System.out.print("Введите целое число => ");
        Scanner scanner = new Scanner(System.in);
        final String inputValue = scanner.next();
        try {
            final int parsedValue = IntegerParser.parseInt(inputValue);
            System.out.println(parsedValue);
        } catch (Throwable throwable) {
            System.out.println("NOP");
        }
//        catch (StringIsTooSmallNumberException e) {
//            System.out.println("Введённое число слишком маленькое.");
//        } catch (StringIsTooBigNumberException e) {
//            System.out.println("Введённое число слишком большое.");
//        } catch (StringNotNumberException e) {
//            System.out.println("Вы ввели не целое число.");
//        } catch (NullStringException | EmptyStringException e) {
//            System.out.println("Введена пустая строка.");
//        }

    }
}