import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowColor extends JFrame implements ActionListener {
    JButton button;

    WindowColor() {
        button = new JButton("弹出颜色对话框");
        button.addActionListener(this);
        setLayout(new FlowLayout());
        add(button);
        setBounds(100, 100, 300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color newColor = JColorChooser.showDialog(this, "调色板", button.getBackground());
        if (newColor == null) {
            button.setBackground(newColor);
        }
    }
}
