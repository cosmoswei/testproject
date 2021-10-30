import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.net.URL;

public class WindowHTML extends JFrame implements ActionListener, Runnable {
    JButton button;
    URL url;
    JTextField textField;
    JTextArea textArea;
    byte b[] = new byte[118];
    Thread thread;

    public WindowHTML() {
        textArea = new JTextArea(12, 12);
        textField = new JTextField(20);
        button = new JButton("确定");
        button.addActionListener(this);
        thread = new Thread(this);
        JPanel panel = new JPanel();
        panel.add(new JLabel("输入网址:"));
        panel.add(textField);
        panel.add(button);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(panel, BorderLayout.NORTH);
        setBounds(60, 60, 450, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!thread.isAlive()) {
            thread = new Thread(this);
        }
        try {
            thread.start();
        } catch (Exception ee) {
            textField.setText("我正在读取：" + url);
        }
    }

    @Override
    public void run() {
        try {
            int n = -1;
            textArea.setText(null);
            url = new URL(textField.getText().trim());
            InputStream in = url.openStream();
            while ((n = in.read(b)) != -1) {
                String s = new String(b, 0, n);
                textArea.append(s);
            }
        } catch (Exception e1) {
            textField.setText(" " + e1);
        }

    }
}
