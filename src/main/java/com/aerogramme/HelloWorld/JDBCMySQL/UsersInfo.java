package com.aerogramme.HelloWorld.JDBCMySQL;

import java.sql.Date;

public class UsersInfo {

    private int id;
    private String first_name;
    private String last_name;
    private Date date_created;
    private int is_admin;
    private int num_points;

    public UsersInfo(){}

    public UsersInfo(int id, String first_name, String last_name, Date date_created, int is_admin, int num_points) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_created = date_created;
        this.is_admin = is_admin;
        this.num_points = num_points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public int getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(int is_admin) {
        this.is_admin = is_admin;
    }

    public int getNum_points() {
        return num_points;
    }

    public void setNum_points(int num_points) {
        this.num_points = num_points;
    }

    @Override
    public String toString() {
        return "UsersInfo[" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", date_created=" + date_created +
                ", is_admin=" + is_admin +
                ", num_points=" + num_points +
                ']';
    }
}
