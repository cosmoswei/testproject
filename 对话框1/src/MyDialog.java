import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyDialog extends JDialog implements ActionListener {
    static final int YES = 1, NO = 0;
    int message = -1;
    JButton yes, no;

    MyDialog(JFrame f, String s, boolean b) {
        super(f, s, b);
        yes = new JButton("YES");
        yes.addActionListener(this);
        no = new JButton("NO");
        no.addActionListener(this);
        setLayout(new FlowLayout());
        add(yes);
        add(no);
        setBounds(60, 60, 200, 200);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                message = -1;
                setVisible(false);
                super.windowClosing(e);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == yes) {
            message = YES;
            setVisible(true);
        } else if (e.getSource() == no) {
            message = NO;
            setVisible(false);
        }
    }

    public int getMessage() {
        return message;
    }
}
