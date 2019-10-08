package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;

public class JComboBoxDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JComboBox Demo");
        JPanel panel = new JPanel();


        String[] networks = {"MTN", "Airtel", "Tigo", "Vodafone", "T Mobile", "AT&T", "Kasapa"};

        JComboBox comboBox = new JComboBox(networks);
        comboBox.setEditable(false);
        comboBox.setBounds(100, 100, 100, 50);
        comboBox.setVisible(true);
        comboBox.setEnabled(true);


        comboBox.addActionListener(e -> {

            int count = comboBox.getItemCount();
            Object items = comboBox.getItemAt(comboBox.getSelectedIndex());

            JOptionPane.showMessageDialog(frame, "Items count:" + count + ", item selected : " + items);

            String name = JOptionPane.showInputDialog(frame, "Enter your name", "Information", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(name);


            int option = JOptionPane.showConfirmDialog(frame,"Are you sure?", "Information", JOptionPane.INFORMATION_MESSAGE);
            if(option == JOptionPane.YES_OPTION){
                yesMessage();
            } else if(option == JOptionPane.NO_OPTION){
               noMessage();
            }

        });

        frame.add(comboBox);
        frame.add(panel);

        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public  static void yesMessage(){
        System.out.println("YES selected");
    }

    public static  void noMessage(){
        System.out.println("NO selected");
    }
}