import javax.swing.*;
import java.util.Objects;

public class Simulequate {
    public void simul(){
        double a1 = Double.parseDouble(JOptionPane.showInputDialog(null, "What is a1:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "What is b1:"));
        double c1 = Double.parseDouble(JOptionPane.showInputDialog(null, "What is c1:"));
        double a2 = Double.parseDouble(JOptionPane.showInputDialog(null, "What is a2:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "What is b2:"));
        double c2 = Double.parseDouble(JOptionPane.showInputDialog(null, "What is c2:"));

        // Calculation Process
        double top1 = (a2*c1) - (a1*c2);
        double top2 = (a2*b1) - (a1*b2);
        double y = (top1) / (top2);
        double top3 = (c1-(b1 *y));
        double x = (top3) / (a1);

        JOptionPane.showMessageDialog(null,"The value of x: " + x +"\n"
        + "The value of y: " + y);


        String choice1 = JOptionPane.showInputDialog(null, "Do you want to continue: \n" +
                "(yes/y or no/n)");

        if (Objects.equals(choice1, "yes") || Objects.equals(choice1, "y") || Objects.equals(choice1, "Yes") || Objects.equals(choice1, "Y")) {
            simul();
        }
        else if (Objects.equals(choice1, "no") || Objects.equals(choice1, "n") || Objects.equals(choice1, "No") || Objects.equals(choice1, "N")) {

            JOptionPane.showMessageDialog(null, "Terminate Program");
        }

        else {
            JOptionPane.showMessageDialog(null, "Wrong Input\n"+"Terminate Program");
        }
    }
}
