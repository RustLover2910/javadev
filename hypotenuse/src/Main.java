import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double x,y,z;
        Scanner scan = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "This is a Hypotenuse calculator!");

        x = Double.parseDouble(JOptionPane.showInputDialog("Please give side A."));
        y = Double.parseDouble(JOptionPane.showInputDialog("Please give side B."));

        z = Math.sqrt((x*x) + (y*y));

        JOptionPane.showMessageDialog(null, "The Hypotenuse is " + z + ".");

        scan.close();

    }
}