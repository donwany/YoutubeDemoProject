package com.aerogramme.HelloWorld.JavaSwing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo {

    JFrame frame;

    JTreeDemo(){

        frame = new JFrame("JTree Demo");
        //JPanel panel = new JPanel();

       /* DefaultMutableTreeNode country = new DefaultMutableTreeNode("Country");
        DefaultMutableTreeNode region = new DefaultMutableTreeNode("Region");
        DefaultMutableTreeNode usa = new DefaultMutableTreeNode("USA");

        country.add(region);
        country.add(usa);

        DefaultMutableTreeNode city1 = new DefaultMutableTreeNode("Accra");
        DefaultMutableTreeNode city2 = new DefaultMutableTreeNode("Tema");
        DefaultMutableTreeNode city3 = new DefaultMutableTreeNode("Adenta");
        DefaultMutableTreeNode atlanta = new DefaultMutableTreeNode("Atlanta");

        region.add(city1);
        region.add(city2);
        region.add(city3);
        usa.add(atlanta);

        JTree tree = new JTree(country);

        frame.add(tree);
*/

        DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");

        style.add(color);
        style.add(font);

        DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");
        DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");

        color.add(red);
        color.add(blue);
        color.add(black);
        color.add(green);

        JTree jt = new JTree(style);

        frame.add(jt);

        //panel.add(tree);
        //frame.add(panel);
        frame.setVisible(true);
        frame.setLocation(500, 500);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

       new JTreeDemo();
    }
}
