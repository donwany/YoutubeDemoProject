package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JFileChooserDemo {
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


        JFrame frame = new JFrame("JFile Chooser Demo");

        JButton button = new JButton("Choose File");
        button.setBounds(50, 100, 100, 50);
        button.setEnabled(true);
        button.setVisible(true);
        button.setToolTipText("Please choose your file");

        // add the actionlistener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /// implement the file selection
                if(e.getSource() == button){

                    JFileChooser fileChooser = new JFileChooser();

                    int i = fileChooser.showOpenDialog(frame);

                    if(i == JFileChooser.APPROVE_OPTION){

                        File file = fileChooser.getSelectedFile();
                        String path = file.getPath();

                        System.out.println(path);

                        try {
                            String line;
                            BufferedReader br = new BufferedReader(new FileReader(path));

                            while ((line = br.readLine()) != null){

                                System.out.println(line);
                            }

                        } catch (java.io.IOException e1) {
                            e1.printStackTrace();
                        }
                    }


                }
            }
        });


        frame.add(button);
        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
