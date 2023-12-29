import javax.swing.*;
import java.util.Objects;

public class Angle {
    public void angle() {
        //double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Angle a:"));
        //double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Angle b:"));
        double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Side A:"));
        double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Side B:"));
        double C = Double.parseDouble(JOptionPane.showInputDialog(null, "Side C:"));

        // Calculation Process
        double inner = ((B*B) + (A*A)) - (C*C);
        double innerRoot = (2*B*A);
        double x1 = (inner) / (innerRoot);
        double x2 = Math.acos(Math.toDegrees(x1));

        JOptionPane.showMessageDialog(null,"The value of the angle c: " + x2);


        String choice1 = JOptionPane.showInputDialog(null, "Do you want to continue: \n" +
                "(yes/y or no/n)");

        if (Objects.equals(choice1, "yes") || Objects.equals(choice1, "y") || Objects.equals(choice1, "Yes") || Objects.equals(choice1, "Y")) {
            angle();
        }
        else if (Objects.equals(choice1, "no") || Objects.equals(choice1, "n") || Objects.equals(choice1, "No") || Objects.equals(choice1, "N")) {

            JOptionPane.showMessageDialog(null, "Terminate Program");
        }

        else {
            JOptionPane.showMessageDialog(null, "Wrong Input\n"+"Terminate Program");
        }
    }

    public void side() {
        //double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Angle a:"));
        //double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Angle b:"));
        double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Side A:"));
        double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Side B:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "angle c:"));

        // Calculation Process
        double inner = ((B*B) + (A*A));
        double innerRoot = (2*B*A) * Math.cos(Math.toDegrees(c));
        double x1 = (inner) - (innerRoot);
        double x2 = Math.sqrt(x1);

        JOptionPane.showMessageDialog(null,"The value of the Side C: " + x2);


        String choice1 = JOptionPane.showInputDialog(null, "Do you want to continue: \n" +
                "(yes/y or no/n)");

        if (Objects.equals(choice1, "yes") || Objects.equals(choice1, "y") || Objects.equals(choice1, "Yes") || Objects.equals(choice1, "Y")) {
            side();
        }
        else if (Objects.equals(choice1, "no") || Objects.equals(choice1, "n") || Objects.equals(choice1, "No") || Objects.equals(choice1, "N")) {

            JOptionPane.showMessageDialog(null, "Terminate Program");
        }

        else {
            JOptionPane.showMessageDialog(null, "Wrong Input\n"+"Terminate Program");
        }
    }

}
