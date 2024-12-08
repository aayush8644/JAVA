import javax.swing.*;

public class MyBoxLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Boxlayout Example");
                //create a cointainer
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        JButton button1=new JButton("button1");
        JButton button2=new JButton("button2");
        JButton button3=new JButton("button3");
        JButton button4=new JButton("button4");
        JButton button5=new JButton("button15");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
//add to theframe
        frame.add(panel);
//frame setings
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}