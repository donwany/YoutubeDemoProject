package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controllers {


    public static void clickMe(JButton btn){

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked me");
            }
        });
    }

}
