import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PoliceListen implements ActionListener {
    JTextField text;

    public void setJTextField(JTextField text) {
        this.text = text;
    }

    public void actionPerformed(ActionEvent e) {
//        int n = 0, m = 0;
//        String str = e.getActionCommand();
//        try {
//            n = Integer.parseInt(str);
//            m = n * n;
//            System.out.println(n + "的平方是：" + m);
//        } catch (Exception ee) {
//            System.out.println(ee.toString());
//        }
        int n = 0, m = 0;
        JTextField textSorce = (JTextField) e.getSource();
        String str = textSorce.getText();
        if (!str.isEmpty()) {
            try {
                n = Integer.parseInt(str);
                m = n * n;
                text.setText(n+" 的阶乘 " + m);
            } catch (Exception ee) {
                textSorce.setText("请输入数字");
            }
        }
    }
}
