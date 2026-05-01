/**
 * Question class — represents one multiple-choice question.
 *
 * This class uses only basic AP CSA concepts:
 *   - Instance variables (encapsulation using private fields)
 *   - A constructor
 *   - Getter methods
 *   - A method that returns a boolean (isCorrect)
 *
 * No inheritance, no abstract classes, no polymorphism.
 */
public class Question {

    // Instance variables (private = encapsulation, an AP CSA topic)
    private String questionText;
    private String[] options;     // always 4 options: A, B, C, D
    private int correctIndex;     // 0, 1, 2, or 3
    private String explanation;   // shown after the user answers

    // Constructor
    public Question(String questionText, String[] options, int correctIndex, String explanation) {
        this.questionText = questionText;
        this.options = options;
        this.correctIndex = correctIndex;
        this.explanation = explanation;
    }

    // Getter methods
    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectIndex() {
        return correctIndex;
    }

    public String getExplanation() {
        return explanation;
    }

    // Checks if the user's answer is correct.
    // userAnswer is expected to be 0, 1, 2, or 3.
    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctIndex;
    }
}
