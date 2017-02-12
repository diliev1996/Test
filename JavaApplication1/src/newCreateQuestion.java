
import org.jdesktop.xswingx.PromptSupport;
import ControlLayer.QuestionCtrl;
import ControlLayer.StringException;
import ModelLayer.Question;
import java.awt.Dimension;
import java.io.ObjectOutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *  newCreateQuestion class used in order a new question to be created
 * @author viva
 */
public class newCreateQuestion extends javax.swing.JFrame {

    private QuestionCtrl questionCtrl;
    private OptionsMenu optionsMenu;
    private ArrayDeque<JTextField> textFields;
    private JTextField field;

    public newCreateQuestion() {
        initComponents();
    }
    
    /**
     * Setting what should be typed in every field "can be done in smarter way"
     */
    private void makeFields() {
        for (JTextField f : textFields) {
            PromptSupport.setPrompt("Грешен отговор", f);
            this.field = f;
        }
        PromptSupport.setPrompt("Верен отговор", field);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        Question = new javax.swing.JTextField();
        QuestionInput = new javax.swing.JTextField();
        Answers = new javax.swing.JTextField();
        AnswerA = new javax.swing.JTextField();
        AnswerB = new javax.swing.JTextField();
        AnswerC = new javax.swing.JTextField();
        AnswerD = new javax.swing.JTextField();
        Message = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        goBack = new javax.swing.JButton();

        textFields = new ArrayDeque<>();
        textFields.add(AnswerA);
        textFields.add(AnswerB);
        textFields.add(AnswerC);
        textFields.add(AnswerD);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Question.setText("Въпрос:");
        Question.setEditable(false);

        Answers.setText("Отговори:");
        Answers.setEditable(false);

        Message.setEditable(false);

        PromptSupport.setPrompt("Въведете въпрос", QuestionInput);
        makeFields();

        addButton.setText("Добави");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    addButtonActionPerformed(evt);
                } catch (StringException ex) {
                    ex.Message();
                }
            }
        });

        goBack.setText("Назад");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(QuestionInput)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(Answers, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(AnswerA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(AnswerC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(55, 55, 55)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(AnswerD, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(AnswerB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(52, 52, 52))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(Message)
                                                        .addGap(168, 168, 168)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(goBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))))
                        .addGap(184, 184, 184))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{Answers, Question});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{AnswerA, AnswerB, AnswerC, AnswerD});

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(QuestionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Answers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AnswerA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AnswerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AnswerC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AnswerD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(goBack))
                        .addContainerGap(122, Short.MAX_VALUE))
        );
        questionCtrl = new QuestionCtrl();
        pack();
    }// </editor-fold>                        
    /**
     * Used to a add a new question to the collection
     * 
     * @param evt
     * @throws StringException if some of the fields is left empty
     */
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) throws StringException {
        StringException me = new StringException();
        ObjectOutputStream out = null;
        if (!me.StringLength(QuestionInput.getText())) {
            throw new StringException();
        } else {
          Question question = questionCtrl.createQuestion(QuestionInput.getText()); // creates the new question by the question input text
            for (JTextField fiel : textFields) {
                if (!me.StringLength(fiel.getText())) {
                    throw new StringException();
                } else {
                    questionCtrl.addAnswer(question, fiel.getText()); // adding the answers  from each text fieldto the newly created question
                }
            }
                questionCtrl.addQuestion(question); // adding it to the collection and saving
              
                Message.setText("Добавен успешно!");
                
                QuestionInput.setText(""); // ressing the fields
                for (JTextField fiel : textFields) {
                    fiel.setText("");
                }
            }
     }
    /**
     *  Returns to the previous menu
     * @param evt   
     */
    private Dimension getDimension() {
        return this.getSize();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField AnswerA;
    private javax.swing.JTextField AnswerB;
    private javax.swing.JTextField AnswerC;
    private javax.swing.JTextField AnswerD;
    private javax.swing.JTextField Answers;
    private javax.swing.JTextField Message;
    private javax.swing.JTextField Question;
    private javax.swing.JTextField QuestionInput;
    private javax.swing.JButton addButton;
    private javax.swing.JButton goBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}
