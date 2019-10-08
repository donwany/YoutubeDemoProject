package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JPASSWORDFIELD");

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(5, 20, 100, 50);
        passwordField.setEnabled(true);
        passwordField.setEchoChar('#');
        passwordField.setToolTipText("Enter your password:");


        JButton button = new JButton("Login");
        button.setBounds(200, 500, 5, 5);
        button.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                char [] password = passwordField.getPassword();

                System.out.println(new String(password));

            }
        });




        frame.add(passwordField);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocation(500,500);

    }
}
