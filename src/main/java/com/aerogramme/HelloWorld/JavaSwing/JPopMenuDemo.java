package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPopMenuDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JPopupMenu Demo");
        JPanel panel = new JPanel();


        final JPopupMenu popupMenu = new JPopupMenu("File");


        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem printItem = new JMenuItem("Print");
        JMenuItem closeItem = new JMenuItem("Close");
        JMenuItem contactItem = new JMenuItem("Contact us");
        JMenuItem projectItem = new JMenuItem("Project");
        JMenuItem moduleItem = new JMenuItem("Module");

        popupMenu.add(newItem);
        popupMenu.addSeparator();
        popupMenu.add(openItem);
        popupMenu.addSeparator();
        popupMenu.add(printItem);
        popupMenu.addSeparator();
        popupMenu.add(closeItem);
        popupMenu.addSeparator();
        popupMenu.add(contactItem);
        popupMenu.addSeparator();
        popupMenu.add(projectItem);
        popupMenu.addSeparator();
        popupMenu.add(moduleItem);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //super.mouseClicked(e);
                //JOptionPane.showMessageDialog(frame,"You clicked me:" + e.getX() + ":" + e.getY(),"Click", JOptionPane.INFORMATION_MESSAGE);
                popupMenu.show(frame, e.getX() , e.getY());
            }

        });


        frame.add(popupMenu);

        frame.add(panel);
        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
