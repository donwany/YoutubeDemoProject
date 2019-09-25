package com.aerogramme.HelloWorld;

public class BankApp {

    private double balance;
    private int id;
    private String nameOfAccountHolder;

    public BankApp(){}

    public BankApp(double balance, int id, String nameOfAccountHolder) {
        this.balance = balance;
        this.id = id;
        this.nameOfAccountHolder = nameOfAccountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfAccountHolder() {
        return nameOfAccountHolder;
    }

    public void setNameOfAccountHolder(String nameOfAccountHolder) {
        this.nameOfAccountHolder = nameOfAccountHolder;
    }

    // withdrawal method
    public  double withdraw(double amount){
        if(amount < 0.0){
            System.out.println("You cannot withdraw negative amount from your account, Sorry!");
        }else {
            this.balance = this.balance - amount;
            System.out.println("$" + amount + " have been withdrawn from your account");
        }
        return  this.balance;
    }

    // deposit method
    public double deposit(double amount){
        if(amount < 0){
            System.out.println("You cannot deposit negative amount in your account, Sorry!");
        }else {
            this.balance = balance + amount;
            System.out.println("$" + amount + " has been deposited in your account");
        }
        return this.balance;
    }


    @Override
    public String toString() {
        return "BankApp[" +
                "balance=" + balance +
                ", id=" + id +
                ", nameOfAccountHolder='" + nameOfAccountHolder + '\'' +
                ']';
    }
}
