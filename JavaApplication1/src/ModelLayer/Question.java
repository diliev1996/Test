package ModelLayer;

import java.util.ArrayDeque;
import java.io.Serializable;
/*
* Main class in the game. Each question holds an arrayList of answers
*/
public class Question implements Serializable {

    private ArrayDeque<Answer> answers;
    private String question;
    private int rating;
    /*
    * Consturctor of class Question 
    */
    public Question(String question,int rating) {
        this.question = question;
        this.rating = rating;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    /**
     * 
     * @return all answers to the specified Question
     */
    public ArrayDeque<Answer> getAnswers() {
        if (answers == null) {
            answers = new ArrayDeque<>();
        }
        return answers;
    }
    /**
     * 
     * @return question title
     */
    public String toString() {
        return question;
    }

}
