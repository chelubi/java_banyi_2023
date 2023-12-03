package quizmaker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuizManager {
    private List<Question> questions;
    private Scanner scanner;

    public QuizManager() {
        this.questions = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    /**
     * метод для завантаження питань 
     */
    public void loadQuestions() {

        questions.add(new Question("What is the capital of France?", 
                                   List.of("Paris", "London", "Berlin", "Madrid"), "Paris"));
        questions.add(new Question("Who wrote 'Romeo and Juliet'?", 
                                   List.of("William Shakespeare", "Charles Dickens", "Leo Tolstoy", "Jane Austen"), "William Shakespeare"));
        questions.add(new Question("whp wrote this questions?", 
                List.of("You", "Me", "Obama", "ChatGPT"), "ChatGPT"));

    }

    /**
     *  метод для проведення вікторини
     */
    public void conductQuiz() {
        int score = 0;
        for (Question question : questions) {
            System.out.println(question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (question.checkAnswer(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is: " + score + "/" + questions.size());
    }

    /**
     *  метод для завершення роботи з вікториною
     */
    public void close() {
        scanner.close();
    }
}