import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        //create a frame
        JFrame frame=new JFrame("flowlayout example");
        frame.setSize(400,200);

        //set flowlayout
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));

        //add buttons
        frame.add(new JButton("button1"));
        frame.add(new JButton("button2"));
        frame.add(new JButton("button3"));
        frame.add(new JButton("button4"));
        frame.add(new JButton("button5"));

        //make the frame visible
        frame.setVisible(true);
    }
}
