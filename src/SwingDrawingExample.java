
import javax.swing.*;
import java.awt.*;

public class SwingDrawingExample extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawLine(20, 20, 180, 100);
        g.setColor(Color.BLUE);
        g.drawRect(50, 150, 100, 80);
        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 100, 100);
        g.setColor(Color.ORANGE);
        g.fillRect(250, 180, 120, 60);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Drawing Example");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            SwingDrawingExample drawingPanel = new SwingDrawingExample();
            frame.add(drawingPanel);

            frame.setVisible(true);
        });
    }
}