package ModelLayer;

import java.io.Serializable;

public class Answer implements Serializable {

    private String answer;
    private boolean status;

    /**
     * Constructor for objects of class Answer Typically set as false, only on
     * of them to be make true later
     */
    public Answer(String answer) {
        this.answer = answer;
        status = false;
    }

    /*
    * Changing the status of the answer 
     */
    public void changeStatus() {
        status = true;
    }

    /*
    * return the name of the answer
     */
    public String toString() {
        return answer;
    }

    /*
    * Changing the title of the answer and returning its new title
     */
    public String changeTitle(String title) {
        answer = title;
        return answer;
    }

    /**
     *
     * @return the status of the specified answer
     */
    public boolean getStatus() {
        return status;
    }
}
