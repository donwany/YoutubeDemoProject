package com.aerogramme.HelloWorld.JDBCMySQL;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginDemo {

    public  static DBControllers controllers = new DBControllers();

    public static void main(String[] args) {

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

        JFrame frame = new JFrame("Login");

        final JLabel label = new JLabel();
        label.setBounds(20,150, 200,50);

        final JPasswordField value = new JPasswordField();
        value.setBounds(100,75,100,30);
        value.setEchoChar('*');

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(20,20, 80,30);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20,75, 80,30);

        JButton b = new JButton("Login");
        b.setBounds(100,120, 80,30);
        b.setVisible(true);
        b.setEnabled(true);

        final JTextField text = new JTextField();
        text.setBounds(100,20, 100,30);

        frame.add(value);
        frame.add(l1);
        frame.add(label);
        frame.add(l2);
        frame.add(b);
        frame.add(text);
        frame.setLocation(400,400);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);


        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String username =  text.getText();
                String password = new String(value.getPassword());

                controllers.loginUsers(username, password);

                System.out.println("username:" + username +", and password:" + password);
                //label.setText(data);
            }
        });
    }
}
