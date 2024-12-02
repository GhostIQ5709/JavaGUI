import javax.swing.*;
import java.io.File;

public class SwingCreateFolderExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingCreateFolderExample::run);
    }

    private static void run() {
        JFrame frame = new JFrame("Create Folder Example");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton createButton = new JButton("Create Folder");
        createButton.addActionListener(e -> {
            String folderName = JOptionPane.showInputDialog("Enter folder name:");
            if (folderName != null && !folderName.isEmpty()) {
                File folder = new File(folderName);
                if (folder.mkdir()) {
                    JOptionPane.showMessageDialog(null, "Folder created: " + folder.getAbsolutePath());
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to create folder.");
                }
            }
        });

        panel.add(createButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}