import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame= new JFrame("swing component example");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel=new JPanel();


        JLabel label=new JLabel("enter your name:");
        JTextField textField = new JTextField(15);
        JButton button= new JButton("submit");

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        frame.add(panel);

        frame.setVisible(true);

    }
}
