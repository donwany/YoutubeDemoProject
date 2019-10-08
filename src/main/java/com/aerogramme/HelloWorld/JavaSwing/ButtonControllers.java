package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ButtonControllers {

    public static void ButtonClicks(){

        JFrame frame = new JFrame("Hello Button");
        JButton btn = new JButton("Show");

        btn.setBounds(50, 100, 100, 50);
        btn.setEnabled(true);
        btn.setBackground(Color.BLUE);



        // adding click event to button
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You just clicked me");
                try {
                    String host = InetAddress.getByName("www.fundmegh.com").getHostAddress();
                    System.out.println(host);
                } catch (UnknownHostException ex) {
                    ex.printStackTrace();
                }
            }
        });


        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(btn);

    }

    public  static JFrame initJFrame(JFrame frame){

        frame = new JFrame("Hello Button");
        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return frame;
    }



}
