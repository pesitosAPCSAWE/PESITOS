import java.util.ArrayList;

/**
 * Lesson class — holds a lesson title, intro text, and a list of questions.
 *
 * Uses AP CSA topics:
 *   - ArrayList<Question>  (generic ArrayList holding objects of another class)
 *   - Methods that return values
 *   - Basic encapsulation (private fields + getters)
 */
public class Lesson {

    private String title;
    private String intro;
    private ArrayList<Question> questions;

    // Constructor
    public Lesson(String title, String intro) {
        this.title = title;
        this.intro = intro;
        this.questions = new ArrayList<Question>();
    }

    // Add a question to this lesson
    public void addQuestion(Question q) {
        questions.add(q);
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getIntro() {
        return intro;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getNumberOfQuestions() {
        return questions.size();
    }

    // Returns one specific question by index
    public Question getQuestion(int index) {
        return questions.get(index);
    }
}
