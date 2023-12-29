import javax.swing.*;
import java.util.Objects;

public class Midpoint {
    public void midpoint() {

            double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Point x:"));
            double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Point y:"));
            double x1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Point x1:"));
            double y1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Point y1:"));

            // Calculation Process
            double x3 = ((x + x1)/2);
            double y3 = ((y + y1)/2);

            JOptionPane.showMessageDialog(null,"The coordinates of the midpoint: ( " + x3+", "+ y3+" )");


            String choice1 = JOptionPane.showInputDialog(null, "Do you want to continue: \n" +
                    "(yes/y or no/n)");

            if (Objects.equals(choice1, "yes") || Objects.equals(choice1, "y") || Objects.equals(choice1, "Yes") || Objects.equals(choice1, "Y")) {
                midpoint();
            }
            else if (Objects.equals(choice1, "no") || Objects.equals(choice1, "n") || Objects.equals(choice1, "No") || Objects.equals(choice1, "N")) {

                JOptionPane.showMessageDialog(null, "Terminate Program");
            }

            else {
                JOptionPane.showMessageDialog(null, "Wrong Input\n"+"Terminate Program");
            }




    }

    public void distance() {

        double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Point x:"));
        double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Point y:"));
        double x1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Point x1:"));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Point y1:"));

        // Calculation Process
        double x3 = ((x - x1) * (x - x1));
        double y3 = ((y - y1) * (y - y1));
        double dist = Math.sqrt((x3 + y3));

        JOptionPane.showMessageDialog(null,"The Distance between the coordinates: " + dist);


        String choice1 = JOptionPane.showInputDialog(null, "Do you want to continue: \n" +
                "(yes/y or no/n)");

        if (Objects.equals(choice1, "yes") || Objects.equals(choice1, "y") || Objects.equals(choice1, "Yes") || Objects.equals(choice1, "Y")) {
            distance();
        }
        else if (Objects.equals(choice1, "no") || Objects.equals(choice1, "n") || Objects.equals(choice1, "No") || Objects.equals(choice1, "N")) {

            JOptionPane.showMessageDialog(null, "Terminate Program");
        }

        else {
            JOptionPane.showMessageDialog(null, "Wrong Input\n"+"Terminate Program");
        }




    }
}
