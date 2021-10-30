import javax.swing.*;
import java.awt.*;

public class WindowOperation extends JFrame {
    JTextField inputNumberOne, inputNumberTwo;
    JComboBox<String> choiceFuhao;
    JTextArea textShow;
    JButton button;
    OperatorListener operator;
    ComputerListener computer;

    public WindowOperation() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        setLayout(new FlowLayout());
        inputNumberOne = new JTextField(6);
        inputNumberTwo = new JTextField(6);
        choiceFuhao=new JComboBox<String>();
        button =new JButton("计算");
        choiceFuhao.addItem("选择运算符:");
        String[] a = {"+", "-", "*", "/"};
        for (int i = 0; i < a.length; i++) {
            choiceFuhao.addItem(a[i]);
        }
        textShow = new JTextArea(9, 30);
        operator = new OperatorListener();
        computer = new ComputerListener();
        operator.setJCombox(choiceFuhao);
        operator.setWorkTogether(computer);
        computer.setJTextFieldOne(inputNumberOne);
        computer.setJTextFieldTwo(inputNumberTwo);
        computer.setJTextArea(textShow);
        choiceFuhao.addItemListener(operator);
        button.addActionListener(computer);
        add(inputNumberOne);
        add(choiceFuhao);
        add(inputNumberTwo);
        add(button);
        add(new JScrollPane(textShow));
    }
}
