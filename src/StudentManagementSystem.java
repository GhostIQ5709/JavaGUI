
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class StudentManagementSystem {
    private final ArrayList<Student> studentList = new ArrayList<>();
    private final JTextArea outputArea;

    public StudentManagementSystem() {
        JFrame frame = new JFrame("Student Management System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        panel.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        JButton addButton = new JButton("Add Student");
        addButton.addActionListener(this::actionPerformed);

        panel.add(addButton, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void updateOutput() {
        outputArea.setText("");
        for (Student student : studentList) {
            outputArea.append(student.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentManagementSystem::new);
    }

    private void actionPerformed(ActionEvent e) {
        String name = JOptionPane.showInputDialog("Enter student name:");
        String ageStr = JOptionPane.showInputDialog("Enter student age:");
        int age = Integer.parseInt(ageStr);
        Student student = new Student(name, age);
        studentList.add(student);
        updateOutput();
    }
}