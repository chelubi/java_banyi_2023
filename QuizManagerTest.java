package quizmaker;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class QuizManagerTest {
    private QuizManager quizManager;

    @Before
    public void setUp() {
        quizManager = new QuizManager();
        quizManager.loadQuestions();
    }

    @Test
    public void testLoadQuestions() {
        /**
         *  перевірка, чи питання були завантажені
         */
        assertNotNull("Questions list should not be null", quizManager.getQuestions());
        assertFalse("Questions list should not be empty", quizManager.getQuestions().isEmpty());
    }

    @Test
    public void testQuestionFormat() {
        /**
         *  перевірка формату кожного питання
         */
        for (Question question : quizManager.getQuestions()) {
            assertNotNull("Question text should not be null", question.getQuestionText());
            assertNotNull("Options should not be null", question.getOptions());
            assertFalse("Options should not be empty", question.getOptions().isEmpty());
            assertNotNull("Correct answer should not be null", question.getCorrectAnswer());
        }
    }
}