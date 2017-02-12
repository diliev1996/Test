package ControlLayer;

import javax.swing.JOptionPane;

public class StringException extends Exception {

    public StringException() {
    }

    public boolean StringLength(String str) {
      return (str.length() >= 1);
    }

    public void Message() {
        JOptionPane.showMessageDialog(null, "Всички полета трябва да бъдат запълнени", "Празно поле",
                JOptionPane.ERROR_MESSAGE);

    }
    
}
