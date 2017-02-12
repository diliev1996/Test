
import ControlLayer.StringException;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTextField;
import ControlLayer.QuestionCtrl;
import ModelLayer.Answer;
import ModelLayer.Question;
import java.util.ArrayDeque;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/** Public class deleteOrUpdate enabling the user to simply choose whether he wants to update a given question or to delete it
 * 
 * @author viva
 */
public class deleteOrUpdate extends javax.swing.JFrame {

    private updateQuestion updateMenu;
    private ArrayDeque<JTextField> fields;
    private QuestionCtrl questionCtrl;
    private updateQuestion updateQuestion;
    private Question question;

    /**
     * Creates new form deleteOrUpdate
     */
    public deleteOrUpdate() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                        
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        AnswerA = new javax.swing.JTextField();
        AnswerB = new javax.swing.JTextField();
        AnswerC = new javax.swing.JTextField();
        AnswerD = new javax.swing.JTextField();
        Message = new javax.swing.JTextField();
        goBack = new javax.swing.JButton();
        Submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        searchText.setEnabled(false);

        jButton1.setText("Изтрий");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteQuestion(evt);
            }
        }
        );

        jButton2.setText("Промени отговори");
        jButton2.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton2ActionPerformed(evt);
        });

        jButton3.setText("Промени въпрос");
        jButton3.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton3ActionPerformed(evt);
        });

        goBack.setText("Назад");
        goBack.addActionListener((java.awt.event.ActionEvent evt) -> {
            goBackActionPerformed(evt);
        });

        Submit.setText("Запази промени");
        Submit.addActionListener((java.awt.event.ActionEvent evt) -> {
            try {
                SubmitActionPerformed(evt);
            } catch (StringException ex) {
                Logger.getLogger(deleteOrUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchText)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(AnswerA)
                                                                        .addGap(42, 42, 42)
                                                                        .addComponent(AnswerB))
                                                                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(9, 9, 9)
                                                                        .addComponent(Submit, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addGap(37, 37, 37)
                                                                        .addComponent(AnswerC)))))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                .addComponent(goBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AnswerD))))
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2)
                                .addComponent(jButton3))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AnswerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AnswerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AnswerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AnswerD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(goBack)
                                .addComponent(Submit))
                        .addGap(32, 32, 32))
        );
        questionCtrl = new QuestionCtrl(); // initializing the questionCtrl
        updateQuestion = new updateQuestion();
        question = updateQuestion.findDesiredQuestion(searchText.getText()); // setting the current question displayed as the one typed in the updateQuestion menu "must be a smarter way of that"
        newFields();
        for (JTextField field : fields) {
            field.setEnabled(false);
        }
        FillAnswers(); //filling the fields with the question answers 
        searchText.setText(question.toString()); 
        pack();

    }// </editor-fold>                     

    private void newFields() {
        fields = new ArrayDeque<>();
        fields.add(AnswerA);
        fields.add(AnswerB);
        fields.add(AnswerC);
        fields.add(AnswerD);
    }
    /**
     * 
     * @return the size of the frame
     */
    private Dimension getDimension() {
        return this.getSize();
    }
    /**
     * First it checks whether there is a change from the question loaded and the question state when attempted to save 
     * If there aren't any changes  it assumes that only the answers has been changing and it updating their titles
     * If there is changes in the question field it simply creates a new question with that text
     * and adds each field as an answer to the new question
     * Then it simply delete the old question from the file adds the new one
     * @param evt
     * @throws StringException 
     */
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) throws StringException {
        newFields();
        Iterator<JTextField> it = fields.iterator();
        if (question.toString().contains(searchText.getText())) {
            for (Answer ans : question.getAnswers()) {
                if (it.hasNext()) {
                    ans.changeTitle(it.next().getText());
                    it.remove();
                }
            }
            questionCtrl.save(); //saving the changes made to the answers
        } else {
            Question newQuestion = questionCtrl.createQuestion(searchText.getText());
                while (it.hasNext()) {
                Answer ans = questionCtrl.createAnswer(it.next().getText()); // creates an answer from each text field
                newQuestion.getAnswers().add(ans);
                it.remove();
                }
            
            questionCtrl.addQuestion(newQuestion); // used to save the changes here
            questionCtrl.getQuestions().remove(question);
            question = newQuestion; // changes the field variable to the new question
        }
         Message.setText("Промените запазени успешно");
    }
    /**
     *  Show a JOption pane which shows YES_NO option and it delete the question currently loaded
     * @param ev 
     */
    private void DeleteQuestion(java.awt.event.ActionEvent ev) {
        int reply = JOptionPane.showConfirmDialog(null, "Сигурни ли сте че искате да изтриете избрания въпрос ?", "Изтриване", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION && !questionCtrl.getQuestions().remove(updateQuestion.findDesiredQuestion(searchText.getText()))) {
            JOptionPane.showMessageDialog(null, "Не може да изтриете въпрос който не съществува", "Грешка при изтриването",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            questionCtrl.save();
            JOptionPane.showMessageDialog(null, "Въпросът изтрит успешно");
            back();

        }
    }
    /**
     * Opens the previous menu
     */
    private void back() {
        updateMenu = new updateQuestion();
        this.setVisible(false);
        updateMenu.setVisible(true);
        updateMenu.setSize(getDimension());
    }

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {
        back();
    }
    /**
     * Makes the text fields editable
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        newFields();
        for (JTextField field : fields) {
            field.setEnabled(true);
        }
    }
    /**
     *  Fill the fields with the answers of the question
     */
    protected void FillAnswers() {
        Iterator<JTextField> it = fields.iterator();
        for (Answer ans : question.getAnswers()) {
            if (it.hasNext()) {
                it.next().setText(ans.toString());
                it.remove();
            }
        }
    }
    /**
     *  Enables the question field to be edited
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        searchText.setEnabled(true);
    }

    protected void QuestionSerchField(String t) {
        searchText.setText(t);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField AnswerA;
    private javax.swing.JTextField AnswerB;
    private javax.swing.JTextField AnswerC;
    private javax.swing.JTextField AnswerD;
    private javax.swing.JTextField Message;
    private javax.swing.JButton Submit;
    private javax.swing.JButton goBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField searchText;
    // End of variables declaration                   
}
