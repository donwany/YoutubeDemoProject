package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;

public class JTableExample {
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

        JFrame f = new JFrame();

        String [][]data = {
                {"101", "Donald Trump", "400000"},
                {"102", "Barrack Obama", "300000"},
                {"103", "Nana Addo Akuffo", "500000"}
        };

        String[] column = {"ID", "NAME", "SALARY"};

            JTable jt = new JTable(data,column);
            jt.setBounds(30,40,200,300);
            JScrollPane sp = new JScrollPane(jt);
            f.add(sp);
            f.setSize(300,400);
            f.setVisible(true);

        }
}
