import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.*;

public class WindowNumber extends JFrame {
    JTextField textInput,textShow;
    PoliceListen listener;

    public WindowNumber() {
        init();
        setBounds(200, 200, 150, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
//        setLayout(new FlowLayout());
//        text = new JTextField(10);
//        listener = new PoliceListen();
//        text.addActionListener(listener);
//        add(text);
        setLayout(new FlowLayout());
        textInput =new JTextField(10);
        textShow =new JTextField(10);
        textShow.setEditable(false);
        listener=new PoliceListen();
        listener.setJTextField(textShow);
        textInput.addActionListener(listener);
        add(textInput);
        add(textShow);
    }
}
