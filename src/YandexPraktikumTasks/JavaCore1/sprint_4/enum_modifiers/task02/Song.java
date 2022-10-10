package YandexPraktikumTasks.JavaCore1.sprint_4.enum_modifiers.task02;

import java.util.ArrayList;
import java.util.List;

public class Song {

    public final String artist;
    public final String title;
    public final String genre;

    public Song(String artist, String title, String genre) {
        // инициализация переменных
        this.artist = artist;
        this.title = title;
        this.genre = genre;
    }

    public static void main(String[] args) {
        List<Song> goldenHitsCollection = new ArrayList<>();

        goldenHitsCollection.add(new Song("Quenn", "Show must go on", "Rock")); // добавление нового хита
    }
}
