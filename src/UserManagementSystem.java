import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Username: " + username;
    }
}

public class UserManagementSystem {
    private final Map<String, User> userMap = new HashMap<>();
    private final JTextArea outputArea;

    public UserManagementSystem() {
        JFrame frame = new JFrame("User Management System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        panel.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        JButton addButton = new JButton("Add User");
        addButton.addActionListener(e -> {
            String username = JOptionPane.showInputDialog("Enter username:");
            String password = JOptionPane.showInputDialog("Enter password:");
            User user = new User(username, password);
            userMap.put(username, user);
            updateOutput();
        });

        panel.add(addButton, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void updateOutput() {
        outputArea.setText("");
        for (User user : userMap.values()) {
            outputArea.append(user.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UserManagementSystem::new);
    }
}