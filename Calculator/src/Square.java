import javax.swing.*;
import java.util.Objects;

public class Square {
    public void square() {
        double num = Double.parseDouble(JOptionPane.showInputDialog(null, "What is your number:"));
        double sqr = (num * num);
        JOptionPane.showMessageDialog(null,"The Square of " + num + " is: \n" +
                sqr);


        String choice1 = JOptionPane.showInputDialog(null, "Do you want to continue: \n" +
                "(yes/y or no/n)");

        if (Objects.equals(choice1, "yes") || Objects.equals(choice1, "y") || Objects.equals(choice1, "Yes") || Objects.equals(choice1, "Y")) {
            square();
        }
        else if (Objects.equals(choice1, "no") || Objects.equals(choice1, "n") || Objects.equals(choice1, "No") || Objects.equals(choice1, "N")) {

          JOptionPane.showMessageDialog(null, "Terminate Program");
        }

        else {
            JOptionPane.showMessageDialog(null, "Wrong Input\n"+"Terminate Program");
        }
        


        //}
    }


}
