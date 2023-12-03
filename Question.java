package quizmaker;

import java.util.List;

public class Question {
    private String questionText;
    private List<String> options;
    private String correctAnswer;

    public Question(String questionText, List<String> options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    /**
     *  Гетери
     */
    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     *  Сетери
     */
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    /**
     *  перевірка відповіді
     * 
     */
    public boolean checkAnswer(String answer) {
        return answer != null && answer.equalsIgnoreCase(correctAnswer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(questionText).append("\n");
        for (int i = 0; i < options.size(); i++) {
            sb.append((char)('A' + i)).append(". ").append(options.get(i)).append("\n");
        }
        return sb.toString();
    }
}