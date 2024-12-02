import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {
    private JPanel panelMain;
    private JTextField txtName;
    private JButton btnClick;

public Test() {
    btnClick.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(btnClick,"Hello, " + txtName.getText());
        }
    });
}

    public static void main(String[] args) {
        Test t = new Test();
        t.setContentPane(t.panelMain);
        t.setTitle("Test");
//        t.setSize(300, 400);
        t.setBounds(600, 200, 200, 200);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        this.setContentPane(panelMain);
    }
}
