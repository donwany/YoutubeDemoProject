package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextAreaDemo {

    public static void main(String[] args) {
        // two labels, one textarea and one Button

        JFrame frame = new JFrame("JTextArea");

        JLabel label1 = new JLabel();
        label1.setBounds(50,25,100,30);
        label1.setVisible(true);
        //label1.setSize(100, 50);


        JLabel label2 = new JLabel();
        label2.setBounds(160,25,100,30);
        label2.setVisible(true);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20,75,250,200);

        JButton btn = new JButton("Count words");
        btn.setBounds(100,300,120,30);


        frame.add(label1);
        frame.add(label2);
        frame.add(btn);
        frame.add(textArea);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocation(500,500);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textArea.getText().toLowerCase().trim();

                String[] splt = input.split("\\s");

                label1.setText("count: " + input.length());
                label2.setText("length:" + splt.length);


            }
        });


    }
}
