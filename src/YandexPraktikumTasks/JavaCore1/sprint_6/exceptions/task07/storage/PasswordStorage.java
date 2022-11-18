package YandexPraktikumTasks.JavaCore1.sprint_6.exceptions.task07.storage;

//package storage;

import java.io.IOException;

public interface PasswordStorage {
    void open() throws IOException;
    void store(String user, String password) throws IOException;
    String get(String user) throws IOException;
    void close();
}
