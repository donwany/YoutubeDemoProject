package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;

public class LabelsDemo {

    public static void main(String[] args) {


        JFrame frame = ButtonControllers.initJFrame(new JFrame());

        JLabel label1 = new JLabel("Hello First JLABEL");
        label1.setBounds(5, 5, 500, 100);

        JLabel label2 = new JLabel("Hello Second JLABEL");
        label2.setBounds(5, 50, 500, 100);

        JTextField textField = new JTextField();
        textField.setBounds(5, 200, 300, 50);
        textField.setText("Enter your name");

        JTextField textField1 = new JTextField();
        textField1.setBounds(5, 300, 300, 50);
        textField1.setText("Enter your age");

        frame.add(label1);
        frame.add(label2);
        frame.add(textField);
        frame.add(textField1);

    }

}
