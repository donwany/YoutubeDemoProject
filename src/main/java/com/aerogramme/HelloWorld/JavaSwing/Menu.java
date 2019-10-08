package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;

public class Menu {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JMENU Demo");
        JPanel panel = new JPanel();

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");


        file.add(edit);
        file.add(exit);

        edit.add(newItem);
        edit.add(openItem);

        menuBar.add(file);
        //menuBar.add(exit);

        frame.setJMenuBar(menuBar);

        frame.add(panel);
        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

