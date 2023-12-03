package test.java.Utils;

public class readQuestionsFromFile {
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
	     * метод для читання питань з текстового або CSV файлу
	     * 
	     * 
	     */
	    public List<Question> readQuestionsFromFile(String filename) {
	        List<Question> questions = new ArrayList<>();
	        Path filePath = Path.of(filename);

	        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(",");

	                /**
	                 * перевірка на валідність формату рядка
	                 */
	                if (parts.length >= 2) {
	                    String questionText = parts[0];
	                    String correctAnswer = parts[parts.length - 1];

	                    /**
	                     * список варіантів відповідей (всі частини, крім першої і останньої)
	                     */
	                    List<String> options = new ArrayList<>();
	                    for (int i = 1; i < parts.length - 1; i++) {
	                        options.add(parts[i]);
	                    }

	                    questions.add(new Question(questionText, options, correctAnswer));
	                }
	            }
	        } catch (IOException e) {
	            System.err.println("Error reading from file: " + e.getMessage());
	        }

	        return questions;
	    }

	}

