import javax.swing.*;
import java.util.Objects;

public class Quadequate {
    public void quad() {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "What is a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "What is b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "What is c:"));

        // Calculation Process
        double inner = (b*b) - (4*a*c);
        double innerRoot = Math.sqrt(inner);
        double x1 = (-b + innerRoot) / (2*a);
        double x2 = (-b - innerRoot) / (2*a);

        JOptionPane.showMessageDialog(null,"The value of x1: " + x1 +"\n"
                + "The value of x2: " + x2);


        String choice1 = JOptionPane.showInputDialog(null, "Do you want to continue: \n" +
                "(yes/y or no/n)");

        if (Objects.equals(choice1, "yes") || Objects.equals(choice1, "y") || Objects.equals(choice1, "Yes") || Objects.equals(choice1, "Y")) {
            quad();
        }
        else if (Objects.equals(choice1, "no") || Objects.equals(choice1, "n") || Objects.equals(choice1, "No") || Objects.equals(choice1, "N")) {

            JOptionPane.showMessageDialog(null, "Terminate Program");
        }

        else {
            JOptionPane.showMessageDialog(null, "Wrong Input\n"+"Terminate Program");
        }

    }
}
