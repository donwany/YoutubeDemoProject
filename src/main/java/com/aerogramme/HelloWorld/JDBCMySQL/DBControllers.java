package com.aerogramme.HelloWorld.JDBCMySQL;

import javax.swing.*;
import java.sql.*;

public class DBControllers {

    public  static  Connection conn;

    // create the mysql database connection
    private static String myDriver = "com.mysql.cj.jdbc.Driver";
    private static String myUrl = "jdbc:mysql://127.0.0.1/KAFKA?serverTimezone=UTC";
    private  static String user = "root";
    private static String pwd = "Akron45449@";

    public void loginUsers(String username, String password){

        //System.out.println("Retrieving data from mysql database ...");

        try {
            Class.forName(myDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(myUrl, user, pwd);

            if(conn != null){

                String sql = "SELECT * FROM usersInfo";

                Statement statement = conn.createStatement();

                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()){

                    String user = resultSet.getString(2);
                    String pass = resultSet.getString(3);

                    System.out.println("user:" + user + ", pass:" + pass);

                    if((user.equals(username.trim()) && pass.equals(password.trim()))){
                        JOptionPane.showMessageDialog(new JFrame(), "Login was successfull","",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(new JFrame(), "Login was not successfull, try again!","",JOptionPane.INFORMATION_MESSAGE);
                    }

                }

                statement.close();
                conn.close();

            }else{
                System.out.println("Connection to database failed. Try Again!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void insertData(String message, String message_id ){

        System.out.println("Inserting data into mysql database ...");

        try {
            Class.forName(myDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(myUrl, user, pwd);

            if(conn != null){

                int id = 1;

                String sql = "INSERT INTO facebook_post VALUES(?,?)";

                PreparedStatement ps = conn.prepareStatement(sql);
                //ps.setInt(id++, id);
                ps.setString(id++, message);
                ps.setString(id++, message_id);

                int rowsAffected = ps.executeUpdate();

                if(rowsAffected > 0){
                    System.out.println(rowsAffected + ": Row(s) affected");
                }else{
                    System.out.println("Rows not affected");
                }


            }else{
                System.out.println("Connection to database failed. Try Again!");
            }
            // close connection
            Database.closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
