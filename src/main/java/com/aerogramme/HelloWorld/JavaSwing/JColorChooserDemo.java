package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChooserDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JColorChooser Demo");

        JButton button = new JButton("Set Background Color");
        button.setBounds(20,30, 200, 50);
        button.setVisible(true);
        button.setEnabled(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Color initialColor = Color.PINK;

                Color color = JColorChooser.showDialog(frame,"Select your color", initialColor);

                frame.getContentPane().setBackground(color);

                button.setBackground(color);

            }
        });


        frame.add(button);
        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
