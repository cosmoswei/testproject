import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class OperatorListener implements ItemListener {
    JComboBox<String> choice;

    ComputerListener workTogether;

    public void setJCombox(JComboBox<String> box) {
        choice = box;
    }

    public void setWorkTogether(ComputerListener computer) {
        workTogether = computer;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String fuhao = choice.getSelectedItem().toString();
        workTogether.setFuhao(fuhao);
    }
}
