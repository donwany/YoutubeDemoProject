package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;

public class JTabbedPaneDemo {

    JFrame frame;

    JTabbedPaneDemo(){
        frame  = new JFrame("JTabbedPane Demo");

        JTextArea textArea = new JTextArea(200, 200);
        textArea.setBounds(100, 100, 200, 200);
        textArea.setLineWrap(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel1.add(textArea);

        JTabbedPane pane = new JTabbedPane();
        pane.setBounds(50,50, 200, 200);

        pane.add("State", panel1);
        pane.add("Country", panel2);
        pane.add("City", panel3);


        frame.add(pane);
        frame.setVisible(true);
        //frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JTabbedPaneDemo();
    }

}
