import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class WindowTextSort extends JFrame implements DocumentListener {
    JTextArea text2, text1;

    WindowTextSort() {
        init();
        setLayout(new FlowLayout());
        setVisible(true);
        setBounds(120, 120, 260, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        text1 = new JTextArea(3, 15);
        text2 = new JTextArea(3, 15);
        add(new JScrollPane(text1));
        add(new JScrollPane(text2));
        text1.setLineWrap(true);
        text2.setLineWrap(true);
        text2.setEditable(false);
        (text1.getDocument()).addDocumentListener(this);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        changedUpdate(e);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        changedUpdate(e);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        String str = text1.getText();
        String regex = "[\\s\\d\\p{Punct}]";
        String words[] = str.split(regex);
        Arrays.sort(words);
        text2.setText(null);
        for (String s : words) {
            text2.append(s + ",");
        }
    }
}
