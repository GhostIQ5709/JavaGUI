
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Java Swing Comprehensive Example
public class ComprehensiveSwingExample {
    public static void main(String[] args) {
        // Use invokeLater to ensure GUI runs on the event-dispatching thread
        SwingUtilities.invokeLater(() -> {
            // Create a JFrame (main window)
            JFrame frame = new JFrame("Comprehensive Swing Example");
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a JPanel to hold components
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(4, 1)); // Layout manager

            // Create a JLabel
            JLabel label = new JLabel("Welcome to Java Swing!");
            label.setHorizontalAlignment(JLabel.CENTER);

            // Create a JCheckBox
            JCheckBox checkBox = new JCheckBox("Check Me!");

            // Create a JTextField
            JTextField textField = new JTextField("Type here");

            // Create a JButton
            JButton button = new JButton("Click Me!");
            button.addActionListener(e -> {
                JOptionPane.showMessageDialog(null, "Button Clicked!");
                checkBox.setSelected(true);
                textField.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
                textField.setText("You clicked the button so I checked the check box.");
                panel.setBackground(Color.ORANGE);
            });

            // Add components to the panel
            panel.add(label);
            panel.add(checkBox);
            panel.add(textField);
            panel.add(button);

            // Add the panel to the frame
            frame.add(panel);

            // Make the frame visible
            frame.setVisible(true);
        });
    }
}