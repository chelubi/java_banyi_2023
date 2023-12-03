package quizmaker.utils;

import quizmaker.Question;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FileReaderTest {
    private FileReader fileReader;

    @Before
    public void setUp() {
        fileReader = new FileReader();
    }

    @Test
    public void testReadQuestionsFromFile() {
        String testFilePath = "/Users/oleksandrbani/eclipse-workspace/quizmaker/questions.csv";
        List<Question> questions = fileReader.readQuestionsFromFile(testFilePath);

        assertNotNull("Questions list should not be null", questions);
        assertFalse("Questions list should not be empty", questions.isEmpty());

        /**
         * перевірка структури першого питання, якщо список не пустий
         */
        if (!questions.isEmpty()) {
            Question firstQuestion = questions.get(0);
            assertNotNull("Question text should not be null", firstQuestion.getQuestionText());
            assertNotNull("Options should not be null", firstQuestion.getOptions());
            assertFalse("Options should not be empty", firstQuestion.getOptions().isEmpty());
            assertNotNull("Correct answer should not be null", firstQuestion.getCorrectAnswer());
        }
    }
}