import javax.swing.*;
import java.awt.*;

public class Buju10_4 {
    public static void main(String[] args) {
        new WinGrid();
    }
}

class WinGrid extends JFrame {
    GridLayout grid;
    JPanel chessboard;

    WinGrid() {
        chessboard = new JPanel();
        grid = new GridLayout(12, 12);
        chessboard.setLayout(grid);
        Label label[][] = new Label[12][12];
        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){
                label[i][j]=new Label();
                if((i+j)%2==0){
                    label[i][j].setBackground(Color.blue);
                }else{
                    label[i][j].setBackground(Color.white);
                }
                chessboard.add(label[i][j]);
            }
        }
        add(chessboard,BorderLayout.CENTER);
        add(new JButton("北方参战者"),BorderLayout.NORTH);
        add(new JButton("南方参战者"),BorderLayout.SOUTH);
        add(new JButton("东方参战者"),BorderLayout.EAST);
        add(new JButton("西方参战者"),BorderLayout.WEST);
        setBounds(110,110,570,390);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        validate();
    }
}
