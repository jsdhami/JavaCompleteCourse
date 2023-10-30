import javax.swing.*;
import java.awt.*;

public class NotePad{

    public static void main(String[] args){
        JFrame f = new JFrame("NotePad");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 500);
        f.setLayout(new FlowLayout());



JLabel ulable = new JLabel("Username : ");
f.add(ulable);
JTextField user = new JTextField(20);
f.add(user);
JLabel plable = new JLabel("Password : ");
f.add(plable);
JPasswordField pass = new JPasswordField(20);
f.add(pass);

JButton btn = new JButton("Submit");
f.add(btn);


        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        JMenuItem cutMenuItem = new JMenuItem("Cut");
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        JMenuItem pasteMenuItem = new JMenuItem("Paste");

        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        f.setJMenuBar(menuBar);










    }
}
