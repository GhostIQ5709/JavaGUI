
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEventHandlingExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Event Handling Example");
            frame.setSize(300, 150);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();

            JTextField textField = new JTextField(20);
            JButton button = new JButton("Say Hello");

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String name = textField.getText();
                    JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
                }
            });

            panel.add(new JLabel("Enter your name:"));
            panel.add(textField);
            panel.add(button);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}