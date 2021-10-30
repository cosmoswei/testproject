import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Add extends JFrame implements ActionListener{
    private static final Statement PraparedStatement = null;
    Connection con;

    JLabel id = new JLabel("Id");
    JLabel name = new JLabel("Name");
    JLabel sex = new JLabel("sex");
    JLabel tel = new JLabel("Tel");
    JLabel grade = new JLabel("Grade");
    JLabel address = new JLabel("Address");
    JLabel birthday = new JLabel("Birthday");

    JTextField id1 = new JTextField(10);
    JTextField name1 = new JTextField(10);
    JTextField sex1 = new JTextField(10);
    JTextField tel1 = new JTextField(10);
    JTextField grade1 = new JTextField(10);
    JTextField address1 = new JTextField(10);
    JTextField birthday1 = new JTextField(8);

    JButton yes = new JButton("确认");
    JButton no  = new JButton("取消");

    public Add() {
        setTitle("添加学生信息");
        setLayout(null);

        id.setBounds(100,90,100,50);
        id1.setBounds(300,100,200,30);
        name.setBounds(100,140,100,50);
        name1.setBounds(300,150,200,30);
        sex.setBounds(100,190,100,50);
        sex1.setBounds(300,200,200,30);
        tel.setBounds(100,240,100,50);
        tel1.setBounds(300,250,200,30);
        grade.setBounds(100, 290, 100, 50);
        grade1.setBounds(300, 300, 200, 30);
        address.setBounds(100, 340, 100, 50);
        address1.setBounds(300,350,200,30);
        birthday.setBounds(100, 390, 100, 50);
        birthday1.setBounds(300, 400, 200, 30);

        yes.setBounds(100,450, 100, 60);
        no.setBounds(400, 450, 100,60);

        add(id);
        add(id1);
        add(name);
        add(name1);
        add(sex);
        add(sex1);
        add(tel);
        add(tel1);
        add(grade);
        add(grade1);
        add(address);
        add(address1);
        add(birthday);
        add(birthday1);

        add(yes);
        add(no);

        yes.addActionListener(this);
        no.addActionListener(this);

        setVisible(true);
        setBounds(600,300,600,600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    public static void main(String args[]){
        new Add();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

