package ModelLayer;

import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;

/** QuestionContainer holds all the question in the game
 */
public class QuestionContainer implements Serializable{
    
    private ArrayList<Question> questions;
    private static QuestionContainer instance;
    
    /** Private constructor using Singleton instance
     * 
     */
    private QuestionContainer(){
       questions = new ArrayList<>();
       getObjects(); // using it here so questions are synchronized everytime a game is started
    }
     /** Loading all question already added in the game from the specified file
      *  
      */
     private void getObjects(){
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(new FileInputStream("src/questions.ser"));
            while(true){
                questions = (ArrayList<Question>)input.readObject(); 
            }
        }catch(EOFException | FileNotFoundException e){
             try {
                 input.close();
             }catch(NullPointerException ex){
                JOptionPane.showMessageDialog(null,"Първо трябва да създадете въпроси", "Няма въведени въпроси",
                JOptionPane.ERROR_MESSAGE);                
             } catch (IOException ex) {
                throwMessage();
             }
        } catch (IOException | ClassNotFoundException ex) {
           throwMessage();
        }
    }
     /**
      * 
      * @return singleton instance
      */
    public static QuestionContainer getInstance(){
        if(instance == null){
            instance = new QuestionContainer();
        }
        return instance;
    }
    /*
     *
     * @return the whole collection of questions
     */
    public ArrayList<Question> getQuestions(){
        return questions;
    }
    /**
     *  Error message in case of error when reading from the file
     */
     private void throwMessage(){
     JOptionPane.showMessageDialog(null,"Неочаквана грешка", "Грешка при работата с файл",
                JOptionPane.ERROR_MESSAGE);      
    }

}
