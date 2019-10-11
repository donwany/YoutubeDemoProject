package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayoutManagerDemo {

    public static void main(String[] args) {


        // Layout Manager
        // 1. BorderLayout, 2. GridLayout, 3. CardLayout, 4. FlowLayout

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("BorderLayout Demo");
        JButton b1=new JButton("NORTH");
        JButton b2=new JButton("SOUTH");
        JButton b3=new JButton("EAST");
        JButton b4=new JButton("WEST");
        JButton b5=new JButton("CENTER");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"You are a northener","North",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"You are a south","South",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"You are a center","Center",JOptionPane.INFORMATION_MESSAGE);
            }
        });


        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2,BorderLayout.SOUTH);
        frame.add(b3,BorderLayout.EAST);
        frame.add(b4,BorderLayout.WEST);
        frame.add(b5,BorderLayout.CENTER);


        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        //frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
