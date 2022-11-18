package YandexPraktikumTasks.JavaCore1.sprint_6.files.task01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while_loop:
        while (true) {
            printMenu();
            String command = scanner.nextLine();

            System.out.println("Введите путь к файлу/директории: ");
            String enteredPath = scanner.nextLine();
            // Объявите переменную path с типом Path.
            Path path = Paths.get(enteredPath);

            // Выполните действия в зависимости от введённой команды.
            switch (command) {
                case "exit":
                    System.out.println("Выход.");
                    break while_loop;
                case "ls":
                    try {
                        // выведите список элементов директории
                        List<Path> files = Files.list(path).collect(Collectors.toList());
                        for (Path file : files) {
                            System.out.println(file.getFileName());
                        }
                    } catch (IOException e) {
                        System.out.println("Произошла ошибка при запросе содержимого директории.");
                        e.printStackTrace();
                    }
                    break;

                case "mkdir":
                    try {
                        Files.createDirectory(path);
                        // создайте директорию
                    } catch (IOException e) {
                        System.out.println("Произошла ошибка при создании директории.");
                        e.printStackTrace();
                    }
                    break;
                case "touch":
                    try {
                        // создайте файл
                        Files.createFile(path);
                    } catch (IOException e) {
                        System.out.println("Произошла ошибка при создании файла.");
                        e.printStackTrace();
                    }
                    break;
                case "rename":
                    System.out.println("Введите новое имя файла/директории: ");
                    String newName = scanner.nextLine();

                    try {
                        Files.move(path, path.resolveSibling(newName), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        System.out.println("Произошла ошибка при переименовании файла/директории.");
                        e.printStackTrace();
                    }
                    break;
                case "rm_file":
                    try {
                        if (!Files.isDirectory(path)) {
                            Files.deleteIfExists(path);
                        } else {
                            System.out.println("С помощью этой команды можно удалить только файл!");
                        }
                    } catch (IOException e) {
                        System.out.println("Произошла ошибка при удалении файла.");
                        e.printStackTrace();
                    }
                default:
                    System.out.println("Извините, такой команды пока нет.");
            }

        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("ls - посмотреть содержимое директории.");
        System.out.println("mkdir - создать директорию.");
        System.out.println("touch - создать файл.");
        System.out.println("rename - переименовать директорию/файл.");
        System.out.println("rm_file - удалить файл.");
        System.out.println("exit - выход.");
    }

}