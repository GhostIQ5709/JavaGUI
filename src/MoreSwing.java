// Java Swing - Comprehensive Example
// Java Swing is a GUI (Graphical User Interface) toolkit for Java.
// It provides a set of classes and components to create rich desktop applications.

// Import the necessary packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoreSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create a JFrame (main application window)
            JFrame frame = new JFrame("Swing Comprehensive Example");
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(new Container());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a JPanel and set its layout manager
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(8, 1));

            // Create components
            JLabel titleLabel = new JLabel("Welcome to Swing UI!");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

            JButton button = new JButton("Click me");
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "Button clicked!");
                }
            });

            JTextField textField = new JTextField(20);
//            textField.setSize(100, 20);

            JCheckBox checkBox = new JCheckBox("Check me");
//            checkBox.setSize(20, 20);
            checkBox.setSelected(true);

            JRadioButton radioButton1 = new JRadioButton("Option 1");
            JRadioButton radioButton2 = new JRadioButton("Option 2");
            ButtonGroup radioGroup = new ButtonGroup();
            radioGroup.add(radioButton1);
            radioGroup.add(radioButton2);

            JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
            comboBox.setSelectedIndex(0);

            JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
            slider.setMajorTickSpacing(20);
            slider.setMinorTickSpacing(5);
            slider.setPaintTicks(true);
            slider.setPaintLabels(true);

            // Add components to the panel
            panel.add(titleLabel, BorderLayout.NORTH);
            panel.add(button, BorderLayout.CENTER);
            panel.add(textField, BorderLayout.WEST);
            panel.add(checkBox, BorderLayout.WEST);
            panel.add(radioButton1, BorderLayout.EAST);
            panel.add(radioButton2, BorderLayout.EAST);
            panel.add(comboBox, BorderLayout.WEST);
            panel.add(slider, BorderLayout.SOUTH);

            // Add the panel to the frame
            frame.add(panel);

            // Set the frame to be visible
            frame.setVisible(true);
        });
    }
}
