package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JMenu Demo");
        JPanel panel = new JPanel();

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");
        JMenu submenu = new JMenu("Exit");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem printItem = new JMenuItem("Print");
        JMenuItem closeItem = new JMenuItem("Close");
        JMenuItem contactItem = new JMenuItem("Contact us");

        JMenuItem projectItem = new JMenuItem("Project");
        JMenuItem moduleItem = new JMenuItem("Module");

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        file.add(newItem);
        file.add(printItem);

        file.addSeparator();

        file.add(closeItem);
        file.add(submenu);

        submenu.add(projectItem);
        submenu.add(moduleItem);

        edit.add(openItem);
        help.add(contactItem);

        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Do you want to create a new file?","New", JOptionPane.OK_CANCEL_OPTION);
            }
        });

        closeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Do you really want to close this app?","Close", JOptionPane.OK_CANCEL_OPTION);
            }
        });


        frame.setJMenuBar(menuBar);
        frame.add(menuBar);

        frame.add(panel);
        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
