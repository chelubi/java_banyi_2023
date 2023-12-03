package quizmaker.utils;

import quizmaker.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    /**
     *  метод для читання питань з текстового або CSV файлу
     *
     */
    public List<Question> readQuestionsFromFile(String filename) {
        List<Question> questions = new ArrayList<>();
        Path filePath = Path.of(filename);

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    String questionText = parts[0];
                    List<String> options = List.of(parts[1], parts[2], parts[3]); //перші 3 варіанти
                    String correctAnswer = parts[4]; //правильна відповідь
                    questions.add(new Question(questionText, options, correctAnswer));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return questions;
    }
}