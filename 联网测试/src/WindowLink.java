import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class WindowLink extends JFrame implements Runnable, ActionListener {
    JButton button;
    URL url;
    JTextField textField;
    JEditorPane editorPane;
    byte b[] = new byte[118];
    Thread thread;

    public WindowLink() {
        textField = new JTextField(20);
        editorPane = new JEditorPane();
        editorPane.setEnabled(false);
        button = new JButton("确定");
        button.addActionListener(this);
        thread = new Thread(this);
        JPanel panel = new JPanel();
        panel.add(new JLabel("请输入网址:"));
        panel.add(textField);
        panel.add(button);
        JScrollPane scrollPane = new JScrollPane(editorPane);
        add(scrollPane, BorderLayout.CENTER);
        add(panel, BorderLayout.NORTH);
        setBounds(560, 60, 430, 300);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editorPane.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    try {
                        editorPane.setPage(e.getURL());
                    } catch (Exception e1) {
                    }
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!(thread.isAlive())) {
            thread = new Thread(this);
        }
        try {
            thread.start();
        } catch (Exception ee) {
        }
    }

    @Override
    public void run() {
        try {
            int n = -1;
            editorPane.setText(null);
            url = new URL(textField.getText().trim());
            editorPane.setPage(url);
        } catch (Exception e1) {
            return;
        }
    }
}
