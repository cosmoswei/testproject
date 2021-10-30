import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame implements ActionListener {
    JTextArea text;
    JButton button;
    MyDialog dialog;

    MyWindow() {
        init();
        setBounds(60, 60, 300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        text = new JTextArea(5, 22);
        button = new JButton("打开对话框");
        button.addActionListener(this);
        setLayout(new FlowLayout());
        add(button);
        add(text);
        dialog = new MyDialog(this, "我是对话框", true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            int x = this.getBounds().x + this.getBounds().width;
            int y = this.getBounds().y;
            dialog.setLocation(x, y);
            dialog.setVisible(true);
            if (dialog.getMessage() == MyDialog.YES) {
                text.append("\n你单击了对话框的YES按钮");
            } else if (dialog.getMessage() == MyDialog.NO) {
                text.append("\n你单击了对话框的NO按钮");
            } else if (dialog.getMessage() == -1) {
                text.append("\n你单击了对话框的关闭图标");
            }
        }
    }
}
