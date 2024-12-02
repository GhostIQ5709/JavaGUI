
import javax.swing.*;
import java.awt.*;

public class SwingLayoutExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Layout Example");
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 2, 10, 10)); // 3 rows, 2 columns, 10px gaps

            panel.add(new JLabel("Name:"));
            panel.add(new JTextField());

            panel.add(new JLabel("Age:"));
            panel.add(new JTextField());

            panel.add(new JButton("Submit"));

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}