// Java Swing
// This is a GUI (Graphical User Interface) toolkit for Java.
// It provides a set of classes and components to create rich desktop applications.

// Import the necessary packages
import javax.swing.*; // Import the Swing library

public class SwingExample {
    public static void main(String[] args) {
        // Swing components are typically created and manipulated within the Event Dispatch Thread (EDT).
        // To run Swing code safely, use the SwingUtilities.invokeLater() method.
        SwingUtilities.invokeLater(() -> {
            // Create a JFrame (main application window)
            JFrame frame = new JFrame("Swing Example"); // Create a JFrame object
            frame.setSize(400, 300); // Set the size of the frame (width, height)
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation on window close

            // Create a JPanel (container for components)
            JPanel panel = new JPanel(); // Create a JPanel object

            // Create components
            JLabel label = new JLabel("Hello, Swing!"); // Create a JLabel
            JButton button = new JButton("Click me"); // Create a JButton

            // Add components to the panel
            panel.add(label);
            panel.add(button);

            // Add the panel to the frame
            frame.add(panel);

            // Set the frame to be visible
            frame.setVisible(true);
        });
    }
}