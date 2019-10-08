package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JCheckBox");

        JCheckBox checkBox1 = new JCheckBox("MTN");
        checkBox1.setBounds(100, 100, 100, 50);

        JCheckBox checkBox2 = new JCheckBox("Vodafone");
        checkBox2.setBounds(100, 150, 100, 50);

        JCheckBox checkBox3 = new JCheckBox("Tigo");
        checkBox3.setBounds(100, 200, 100, 50);

        JCheckBox checkBox4 = new JCheckBox("Airtel");
        checkBox4.setBounds(110, 250, 100, 50);


        checkBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if(e.getStateChange() == 1){
                    System.out.println("MTN checked :" + checkBox1.getText());
                }else{
                    System.out.println("MTN Unchecked");
                }
            }
        });

        checkBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == 1){
                    String value = checkBox2.getText();
                    System.out.println("Vodafone checked :" + value);
                }else{
                    System.out.println("Vodafone unchecked");
                }
            }
        });

        checkBox3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == 1){
                    System.out.println("Tigo checked :" + checkBox3.getText());
                }else {
                    System.out.println("Tigo unchecked");
                }
            }
        });







        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(checkBox4);

        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
