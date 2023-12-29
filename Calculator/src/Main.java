import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Square myObj = new Square();
        Squareroot mySqrt = new Squareroot();
        Simulequate mySimul = new Simulequate();
        Quadequate myQuad = new Quadequate();
        Angle myAngle = new Angle();
        Midpoint myDist = new Midpoint();

        JOptionPane.showMessageDialog(null,"Hello there, This is the amateur Calculator \n" + "" +
                "By: David Mbagwu.");
        int choice = Integer.parseInt(JOptionPane.showInputDialog(null,"What would you like to do: \n" +
                "1. Square Root\n" +
                "2. Square\n"+
                "3. Simultaneous Equation\n"+
                "4. Quadratic Equation\n" +
                "5. Find the Missing Side of a Triangle\n" +
                "6. Find the Angle in a Triangle\n" +
                "7. Find the Distance between two points\n"+
                "8. Find the mid-point of two points\n")
        );

        if (choice == 1) {
            JOptionPane.showMessageDialog(null,"You chose: \n" +
                    "Square Root");
            mySqrt.squareRoot();

        }

        if (choice == 2) {
            JOptionPane.showMessageDialog(null,"You chose: \n" +
                    "Square");

            myObj.square();
        }

        if (choice == 3) {
            JOptionPane.showMessageDialog(null,"You chose: \n" +
                    "Simultaneous Equation");

            mySimul.simul();

        }

        if (choice == 4) {
            JOptionPane.showMessageDialog(null,"You chose: \n" +
                    "Quadratic Equation");

            myQuad.quad();

        }

        if (choice == 5) {
            JOptionPane.showMessageDialog(null,"You chose: \n" +
                    "Find the Missing Side of a Triangle");

            myAngle.side();

        }

        if (choice == 6) {
            JOptionPane.showMessageDialog(null,"You chose: \n" +
                    "Find the Angle in a Triangle");

            myAngle.angle();

        }

        if (choice == 7) {
            JOptionPane.showMessageDialog(null,"You chose: \n" +
                    "Find the Distance between two points");

            myDist.distance();

        }

        if (choice == 8) {
            JOptionPane.showMessageDialog(null,"You chose: \n" +
                    "Find the mid-point of two points");

            myDist.midpoint();

        }

        if (choice > 8 || choice < 1) {
            JOptionPane.showMessageDialog(null,"Input is out of bounds.");
        }

    }
}
