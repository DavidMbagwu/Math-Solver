import javax.swing.*;
import java.util.Objects;

public class Squareroot {

    public void squareRoot(){
        double num = Double.parseDouble(JOptionPane.showInputDialog(null, "What is your number:"));
        double sqrt = Math.sqrt(num);

        JOptionPane.showMessageDialog(null,"The Square Root of " + num + " is: \n" +
                sqrt);


        String choice1 = JOptionPane.showInputDialog(null, "Do you want to continue: \n" +
                "(yes/y or no/n)");

        if (Objects.equals(choice1, "yes") || Objects.equals(choice1, "y") || Objects.equals(choice1, "Yes") || Objects.equals(choice1, "Y")) {
            squareRoot();
        }
        else if (Objects.equals(choice1, "no") || Objects.equals(choice1, "n") || Objects.equals(choice1, "No") || Objects.equals(choice1, "N")) {

            JOptionPane.showMessageDialog(null, "Terminate Program");
        }

        else {
            JOptionPane.showMessageDialog(null, "Wrong Input\n"+"Terminate Program");
        }
    }
}
