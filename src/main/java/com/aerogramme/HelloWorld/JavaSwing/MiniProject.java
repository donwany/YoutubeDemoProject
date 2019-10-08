package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MiniProject {

    public static void main(String[] args) {
         JButton btn;
         JLabel label;
         JTextField textField;
         JFrame frame;


            btn = new JButton("Find IP Address");
            btn.setBounds(50, 300, 300, 100);

            label = new JLabel();
            label.setBounds(5, 50, 100, 100);
            label.setVisible(true);

            textField = new JTextField();
            textField.setBounds(150, 100, 300, 100);


            frame = new JFrame("Mini Project");

            frame.setLocation(500, 500);
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setLayout(null);

            frame.add(label);
            frame.add(textField);
            frame.add(btn);


            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                        String input = textField.getText().toLowerCase().trim();

                        try {

                            String IP = InetAddress.getByName(input).getHostAddress();
                            label.setText(IP);

                            System.out.println("You clicked on me");

                        } catch (UnknownHostException e1) {
                            e1.printStackTrace();
                        }

                }
            });

        }

}













