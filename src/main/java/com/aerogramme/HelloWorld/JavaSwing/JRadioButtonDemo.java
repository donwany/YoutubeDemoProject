package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JRadioButtonDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JCheckBox");

        JRadioButton rb1 = new JRadioButton("A) MTN", true);
        rb1.setBounds(100, 50, 150, 50);

        JRadioButton rb2 = new JRadioButton("B) Vodafone");
        rb2.setBounds(100, 100, 150, 50);

        JRadioButton rb3 = new JRadioButton("C) Tigo");
        rb3.setBounds(100, 150, 150, 50);


        String[] languages = {"C", "C++", "C#", "Java", "PHP"};
        JComboBox cb = new JComboBox(languages);
        cb.setBounds(200, 300, 200, 50);
        cb.setEnabled(true);
        //cb.setEditable(true);

        frame.add(cb);

        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Object value = cb.getItemAt(cb.getSelectedIndex());

                System.out.println("Size of item: " + cb.getItemCount() + ", Item selected is :" + value);

                //System.out.println(value);
            }
        });


        // adding radiobutton to buttongroup
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        // adding radiobutton to frame
        frame.add(rb1);
        frame.add(rb2);
        frame.add(rb3);

        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add some action listeners to this radiobutton if selected
        rb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(rb1.isSelected()){

                    //System.out.println("MTN is selected : " + rb1.getText());

                    JOptionPane.showMessageDialog(frame, rb1.getText());


                }
            }
        });

        rb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(rb2.isSelected()){
                    //System.out.println("Vodafone is selected : " + rb2.getText());
                    JOptionPane.showMessageDialog(frame, rb2.getText(), "Radio Button Selection", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });



    }
}
