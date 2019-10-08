package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo {

    public static void main(String[] args) {
        init();
    }

    public static void init(){

        JButton btn = new JButton("Show");
        JFrame frame = new JFrame();
        final JTextField tf = new JTextField();
        tf.setBounds(50,50, 800,800);

        //btn.setIcon(new ImageIcon("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/anm-bg-05.jpg"));
        btn.setBounds(50,100,95,30);

        frame.add(btn);
        frame.add(tf);

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300,400);
        frame.setVisible(true);
        frame.setTitle("JButton Example");
        frame.setLocation(500,500);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to Java Swing " + e.toString());

            }
        });
    }
}
