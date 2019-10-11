package com.aerogramme.HelloWorld.JDBCMySQL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DBConnection {

    public static JFrame frame = new JFrame();
    private  static JButton select;
    private static JButton update;
    private static JButton delete;
    private  static JButton insert;
    public static Database db = new Database();

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


        select = new JButton("Select Data");
        select.setBounds(10, 150, 150,50);
        select.setVisible(true);

        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                db.retrieveData();
            }
        });

        update = new JButton("Update Data");
        update.setBounds(10, 200, 150,50);
        update.setVisible(true);

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                db.updateData();
            }
        });

        insert = new JButton("Insert Data");
        insert.setBounds(10, 250, 150,50);
        insert.setVisible(true);

        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                db.insertData();

            }
        });

        delete = new JButton("Delete Data");
        delete.setBounds(10, 300, 150,50);
        delete.setVisible(true);

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    db.deleteData();
                }catch (Exception ex){
                    ex.getStackTrace();
                }

            }
        });



        frame.add(select);
        frame.add(insert);
        frame.add(delete);
        frame.add(update);

        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLocation(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


    }
}
