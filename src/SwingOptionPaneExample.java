
import javax.swing.*;

public class SwingOptionPaneExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String name = JOptionPane.showInputDialog("Enter your name:");
            if (name != null && !name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
                String age = JOptionPane.showInputDialog("Enter your age:");

            } else {
                JOptionPane.showMessageDialog(null, "You didn't enter a name.");
            }
        });
    }
}