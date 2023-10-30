import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class OpenNotepadExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple Notepad");
            JTextArea textArea = new JTextArea();

            JMenuBar menuBar = new JMenuBar();
            JMenu fileMenu = new JMenu("File");
            JMenuItem openMenuItem = new JMenuItem("Open");
            JMenuItem saveMenuItem = new JMenuItem("Save");

            openMenuItem.addActionListener(e -> {
                JFileChooser fileChooser = new JFileChooser();
                int choice = fileChooser.showOpenDialog(frame);

                if (choice == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                        textArea.read(reader, null);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });

            saveMenuItem.addActionListener(e -> {
                JFileChooser fileChooser = new JFileChooser();
                int choice = fileChooser.showSaveDialog(frame);

                if (choice == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile))) {
                        textArea.write(writer);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });

            fileMenu.add(openMenuItem);
            fileMenu.add(saveMenuItem);
            menuBar.add(fileMenu);

            frame.setJMenuBar(menuBar);
            frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
