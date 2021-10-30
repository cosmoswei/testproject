import javax.swing.*;
import java.awt.*;

public class WinssowMove extends JFrame {
    LP layeredPane;
    WinssowMove(){
        layeredPane =new LP();
        add(layeredPane, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(12,12,30,30);
    }
}
