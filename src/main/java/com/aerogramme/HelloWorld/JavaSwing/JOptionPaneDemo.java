package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionPaneDemo {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                init();
            }
        });


    }

    public static void init(){

        JFrame frame = new JFrame("JOptionPane Demo");
        JPanel panel = new JPanel();

        JButton button = new JButton("Send Mobile Money");
        button.setVisible(true);
        button.setBounds(10,50,400, 50);
        button.setEnabled(true);
        button.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int option = JOptionPane.showConfirmDialog(frame,"Are you sure you want to send money?","MOMO",JOptionPane.YES_NO_OPTION);

                if(option == 1){
                    noMessage(frame);
                }else if(option == 0){

                    yesMessage(frame);
                    sendMoneyMessage(frame);
                }
            }
        });


        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        frame.add(button);

    }

    public static  void noMessage(JFrame frame){
        JOptionPane.showMessageDialog(frame,"Customer does not want to send mobile money");
    }

    public static  void yesMessage(JFrame frame){
        JOptionPane.showMessageDialog(frame,"Customer wants to send mobile money", "Yes/No", JOptionPane.YES_NO_OPTION);
    }

    public static void sendMoneyMessage(JFrame frame){
        String amount = JOptionPane.showInputDialog(frame,"How much do you want to send?","Sending Money ...",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(frame, "You are sending : " + Integer.parseInt(amount) + "GHC", "Amount Sent", JOptionPane.INFORMATION_MESSAGE);
    }

}
