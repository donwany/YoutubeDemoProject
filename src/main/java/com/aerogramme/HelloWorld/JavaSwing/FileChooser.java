package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileChooser {

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

        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("JFileChooser Demo");
        JPanel panel = new JPanel();

        JTextArea textArea = new JTextArea(2000,2000);
        textArea.setBounds(250, 250, 1000,900);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JButton button = new JButton("Open File");
        button.setBounds(50, 150, 100, 50);
        button.setEnabled(true);
        button.setVisible(true);
        button.setToolTipText("Select file");

        button.addActionListener(e -> {

            if(e.getSource() == button){

                JFileChooser fileChooser = new JFileChooser();

                int i = fileChooser.showOpenDialog(frame);

                if(i == JFileChooser.APPROVE_OPTION){

                    File  file = fileChooser.getSelectedFile();
                    String path = file.getPath();
                    System.out.println(path);


                    try {
                        String line, s2 = "";
                        BufferedReader br = new BufferedReader(new FileReader(path));
                        while ((line = br.readLine()) != null ){
                            //System.out.println(line);
                            textArea.setText(s2 += line + "\n");
                        }

                        br.close();
                    } catch (java.io.IOException e1) {
                        e1.printStackTrace();
                    }

                }
            }
        });


        frame.add(textArea);
        frame.add(button);
        frame.add(panel);
        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
