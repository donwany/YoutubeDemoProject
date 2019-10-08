package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ColorChooser {


    public static void main(String[] args) {

        JFrame frame = new JFrame("Color Chooser");

        JButton b = new JButton("Set Color");
        b.setBounds(50,100, 100, 50);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Color initialColor = Color.RED;

                Color color = JColorChooser.showDialog(frame,"Select a color",initialColor);

                frame.getContentPane().setBackground(color);

                //b.setBackground(color);
            }
        });

        frame.add(b);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}