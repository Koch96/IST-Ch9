
package ch9;

//import java.awt.Rectangle;
//import java.util.Scanner;
import javax.swing.JOptionPane;


//@author sak5680

public class Ch9 {

    public static void main(String[] args) {
//        String name = JOptionPane.showInputDialog("What is your name?");
//        JOptionPane.showMessageDialog(null, "Hello + " + name);
        
        String ans = JOptionPane.showInputDialog(null, "What is 2 + 2?", "Math", JOptionPane.QUESTION_MESSAGE);
        if (ans.equals("4")){
            JOptionPane.showMessageDialog(null, "That is Correct!");
            
        }
    }

}
