package com.aerogramme.HelloWorld.JDBCMySQL;

import java.sql.*;
import java.util.Scanner;

public class Database {

    public  static  Connection conn;

    // accept input from keyboard/command line
    Scanner scanner = new Scanner(System.in);
    int id = scanner.nextInt();

    // create the mysql database connection
    private static String myDriver = "com.mysql.cj.jdbc.Driver";
    private static String myUrl = "jdbc:mysql://127.0.0.1/KAFKA?serverTimezone=UTC";
    private  static String user = "root";
    private static String pwd = "Akron45449@";

    public static void connect(){

        System.out.println("Connecting to mysql database ...");

        try {
            Class.forName(myDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(myUrl, user, pwd);

            if(conn != null){
                System.out.println("*********** Connection Established ***********");
            }else{
                System.out.println("Connection to database failed. Try Again!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void retrieveData(){

        System.out.println("Retrieving data from mysql database ...");

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

                   /* int id = resultSet.getInt("id");
                    String first_name = resultSet.getString("first_name");
                    String last_name = resultSet.getString("last_name");
                    Date date_created = resultSet.getDate("date_created");
                    int is_admin = resultSet.getInt("is_admin");
                    int num_points = resultSet.getInt("num_points"); */

                    int id = resultSet.getInt(1);
                    String first_name = resultSet.getString(2);
                    String last_name = resultSet.getString(3);
                    Date date_created = resultSet.getDate(4);
                    int is_admin = resultSet.getInt(5);
                    int num_points = resultSet.getInt(6);


                    // call usersInfo class
                    UsersInfo info = new UsersInfo(id, first_name, last_name, date_created, is_admin, num_points);

                   /* usersInfo.setId(id);
                    usersInfo.setFirst_name(first_name);
                    usersInfo.setLast_name(last_name);
                    usersInfo.setDate_created(date_created);
                    usersInfo.setIs_admin(is_admin);
                    usersInfo.setNum_points(num_points);*/

                    System.out.println("*******************************************************");
                    System.out.println("Id:" + info.getId());
                    System.out.println("First Name:" + info.getFirst_name());
                    System.out.println("Last Name:" + info.getLast_name());
                    System.out.println("Date Created:" + info.getDate_created());
                    System.out.println("Is Admin:" + info.getIs_admin());
                    System.out.println("Number of Points: " + info.getNum_points());


                }

                statement.close();
                closeConnection();
            }else{
                System.out.println("Connection to database failed. Try Again!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void insertData(){

        System.out.println("Inserting data into mysql database ...");

        try {
            Class.forName(myDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(myUrl, user, pwd);

            if(conn != null){

                int id = 7;
                String first_name = "Game";
                String last_name = "Over";
                String date = "2019-11-20";
                int is_admin = 0;
                int num_points = 3500;

                //String sql = "INSERT INTO users VALUES('"+id+"', '"+first_name+"','"+last_name+"','"+date+"','"+is_admin+"','"+num_points+"')";

                String sql = "INSERT INTO users VALUES(?,?,?,?,?,?)";

                //Statement statement = conn.createStatement();
                //int rowsAffected = statement.executeUpdate(sql);

                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, id);
                ps.setString(2, first_name);
                ps.setString(3, last_name);
                ps.setString(4, date);
                ps.setInt(5, is_admin);
                ps.setInt(6, num_points);

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
            closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // update database
    public void updateData(){

        System.out.println("Updating data in mysql database ...");

        try {
            Class.forName(myDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(myUrl, user, pwd);

            if(conn != null){

                int id = 6;
                String newFirstName = "Michael";

                //String sql = "UPDATE users SET first_name = ' "+newFirstName +"' WHERE id = '"+id+"' ";
                //Statement statement = conn.createStatement();

                String sql = "UPDATE users SET first_name = ? WHERE id = ?";

                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, newFirstName);
                statement.setInt(2, id);

                int rowsAffected = statement.executeUpdate();

                if(rowsAffected > 0){
                    System.out.println("Updated Successful!");
                }else{
                    System.out.println("Could not change first name, try again!");
                }


            }else{
                System.out.println("Connection to database failed. Try Again!");
            }
            closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // delete statement
    public void deleteData(){

        System.out.println("Delete data in mysql database ...");

        try {
            Class.forName(myDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(myUrl, user, pwd);

            if(conn != null){

                //int id = 6;
                //String newFirstName = "Michael";
                //String sql = "UPDATE users SET first_name = ' "+newFirstName +"' WHERE id = '"+id+"' ";
                //Statement statement = conn.createStatement();

                String sql = "DELETE FROM users WHERE id = ?";

                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1, id);

                int rowsAffected = statement.executeUpdate();

                if(rowsAffected > 0){
                    System.out.println( rowsAffected + " row(s) affected Successful! :"+ "user with " + id + "removed.");
                }else{
                    System.out.println("Could not delete data, try again!");
                }


            }else{
                System.out.println("Connection to database failed. Try Again!");
            }
            closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void closeConnection(){
        if(conn != null){
            try {
                conn.close();
                System.out.println("******* Database connection closed successfully ***********");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
