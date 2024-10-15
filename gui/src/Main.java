import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        JOptionPane.showMessageDialog(null, "You look pretty young for a " + age + " year old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");


    }
}