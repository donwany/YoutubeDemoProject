package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;

public class JTableDemo {

    JFrame frame;

    JTableDemo(){

        JFrame.setDefaultLookAndFeelDecorated(true);
        frame = new JFrame("JTable Demo");

        String [][]data = {
                {"101", "Donald Trump", "400000"},
                {"102", "Barrack Obama", "300000"},
                {"103", "Nana Addo Akuffo", "500000"}
        };

        String []columns = {"ID","Name","Salary"};

        JTable jTable = new JTable(data, columns);
        jTable.setBounds(50, 100, 200, 200);

        JScrollPane scrollPane = new JScrollPane(jTable);

        frame.add(scrollPane);

        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTableDemo();
            }
        });

    }
}
