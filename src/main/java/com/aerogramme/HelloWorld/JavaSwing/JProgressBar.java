package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;

public class JProgressBar {

    public static final int minValue = 0;
    public static final int maxValue = 100;

    public static void main(String[] args) {


        JFrame frame = new JFrame("ProgressBar Demo");
        JPanel panel = new JPanel();


        JButton button = new JButton("Start");
        button.setVisible(true);
        button.setEnabled(true);
        button.setBounds(50,50,100,50);


        javax.swing.JProgressBar jb = new javax.swing.JProgressBar(javax.swing.JProgressBar.NORTH,0,maxValue);
        jb.setValue(0);
        jb.setStringPainted(true);
        jb.setBounds(40,40,500,250);


        button.addActionListener(e -> {

            // iterate
            int i = minValue;

            while (i <= maxValue){

                jb.setValue(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                i = i + 20;
            }

        });


        frame.add(button);
        frame.add(jb);
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
