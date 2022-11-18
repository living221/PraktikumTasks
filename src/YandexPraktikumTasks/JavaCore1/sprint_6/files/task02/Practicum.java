package YandexPraktikumTasks.JavaCore1.sprint_6.files.task02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);

        // читайте файл построчно и сразу обновляйте frequencyMap.

        // выведите результат в формате "<буква>: <количество>".
        while (br.ready()) {
            String line = br.readLine();
            frequencyMap.put(line, frequencyMap.getOrDefault(line, 0) + 1);
        }

        br.close();

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}