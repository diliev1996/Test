package ControlLayer;

import ModelLayer.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class QuestionCtrl {
    private ArrayList quests;
    /**
     * Takes the questionContainer singleton instance
     */
    public QuestionCtrl() {
        quests = QuestionContainer.getInstance().getQuestions();
    }
    /**
     * Takes all the questions from the Container
     */
    public ArrayList<Question> getQuestions() {
        return quests;
    }
    /** Used to create a new question without any answers
     * 
     * @param title is the title of the question
     * @return the new question
     */
    public Question createQuestion(String title,int rating) {
        Question question = new Question(title,rating);
        return question;
    }
    /** Used to create a new answer
     * 
     * @param title is the title of the new answer
     * @return the new answer
     */
    public Answer createAnswer(String title) {
        Answer answer = new Answer(title);
        return answer;
    }
    
    public Question findQuestion(String title){
        for(Question quest : getQuestions()){
            if(quest.getQuestion().equals(title));
            return quest;
        }
        return null;
    }
    
    public void removeQuestion(Question question){
        quests.remove(question);
    }
    /** Takes all the answers a question is holding
     * 
     * @param question is the specified question
     * @return the answers of that question
     */
    private ArrayDeque<Answer> getAnswers(Question question) {
        return question.getAnswers();
    }
    /** Adding 1 answer object to a question
     *  If the position of which the answer should be added is equal to 4 then its status is changed
     * 
     * @param question the question to which the answer is to be added
     * @param str is the title of the answer
     */
    public void addAnswer(Question question, String str) {
        ArrayDeque list = getAnswers(question);
        if (list.size()!= 3) {
            list.add(new Answer(str));
        } else {
            Answer answer = new Answer(str);
            answer.changeStatus();
            list.add(answer);
        }
    }
    /** Adding question to the Collection and saving it to the file
     * 
     * @param question the desired question to be added
     */
    public void addQuestion(Question question) {
        quests.add(question);
        save();
    }

    /**
     *  Saving the question to the file where all questions are located
     */
    public void save() {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("src/questions.ser"));
            out.writeObject(getQuestions());
        } catch (IOException e) {
            throwMessage();
        } finally {
            try {
                out.close();
            } catch (IOException |NullPointerException e) {
                throwMessage();
            }
        }
    }
    /**
     * Throwing an error message in case of error when working with the file where the questions are saved
     */
    private void throwMessage() {
        JOptionPane.showMessageDialog(null, "Неочаквана грешка", "Грешка при работата с файл",
                JOptionPane.ERROR_MESSAGE);
    }
}
