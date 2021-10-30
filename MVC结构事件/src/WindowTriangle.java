import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowTriangle extends JFrame implements ActionListener {
    Triangle triangle;
    JTextField textA, textB, textC;
    JTextArea showArea;
    JButton controlButton;

    WindowTriangle() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        triangle = new Triangle();
        textA = new JTextField(5);
        textB = new JTextField(5);
        textC = new JTextField(5);
        showArea = new JTextArea();
        controlButton = new JButton("计算面积");
        JPanel pNorth = new JPanel();
        pNorth.add(new JLabel("边A"));
        pNorth.add(textA);
        pNorth.add(new JLabel("边B"));
        pNorth.add(textB);
        pNorth.add(new JLabel("边C"));
        pNorth.add(textC);
        pNorth.add(controlButton);
        controlButton.addActionListener(this);
        add(pNorth, BorderLayout.NORTH);
        add(new JScrollPane(showArea), BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(textA.getText().trim());
            double b = Double.parseDouble(textB.getText().trim());
            double c = Double.parseDouble(textC.getText().trim());
            triangle.setSideA(a);
            triangle.setSideB(b);
            triangle.setSideC(c);
            String area = triangle.getArea();
            showArea.append("三角形" + a + "," + b + "," + c + "的面积：");
            showArea.append(area+ "\n");
        } catch (Exception ex) {
            showArea.append("\n" + ex + "\n");
        }
    }
}
