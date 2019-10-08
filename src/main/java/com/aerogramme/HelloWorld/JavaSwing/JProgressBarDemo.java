package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.JProgressBar;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressBarDemo {

    private static final int minVal = 0;
    private static final int maxVal = 500;

    public static JProgressBar progressBar;

    public static void main(String[] args) {

        JFrame frame = new JFrame("JProgressBar Demo");
        JPanel panel = new JPanel();

        JButton button = new JButton("Start ...");
        button.setBounds(50, 150, 100, 50);
        button.setEnabled(true);
        button.setVisible(true);
        button.setToolTipText("Start Progress Bar");

        progressBar = new JProgressBar(JProgressBar.CENTER, minVal, maxVal);

        progressBar.setValue(minVal);
        progressBar.setBounds(50,50, 200, 100);
        progressBar.setStringPainted(true);
        progressBar.setBorderPainted(true);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // calling init here
                init();
            }
        });



        frame.add(progressBar);
        frame.add(button);
        frame.add(panel);
        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void init(){

        int i = 0;

        while (i <= maxVal){
            progressBar.setValue(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            i += 20;

        }

    }
}
