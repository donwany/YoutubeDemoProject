package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
public class TabbedPaneExample {

    JFrame frame;

    TabbedPaneExample(){

        frame = new JFrame();

        JTextArea ta = new JTextArea(400,400);
        ta.setEditable(true);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.add(ta);
        p2.add(ta);
        p3.add(ta);

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50,50,400,400);

        tp.add("Country",p1);
        tp.add("State",p2);
        tp.add("City",p3);

        frame.add(tp);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        new TabbedPaneExample();
    }
}