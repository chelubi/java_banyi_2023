package quizmaker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuizManager quizManager = new QuizManager();

        System.out.println("Welcome to the Quiz Maker!");
        System.out.println("Select the input mode:");
        System.out.println("1. Enter questions from console");
        System.out.println("2. Load questions from a file");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                /** тут мала бути логіка для вводу запитань з консолі
                 * 
                 */
                break;
            case 2:
                /**
                 *  тут мала бути логіка для завантаження запитань з файлу
                 */
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                break;
        }

        /**
         *  виклик QuizManager для створення та запуску вікторини
         */
        scanner.close();
    }
}