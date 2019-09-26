package com.aerogramme.HelloWorld;

public abstract class iBankAccount {

    private double balance;

    public iBankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // define abstract method
    abstract double computerPay(double amount);


    // withdraw

    public double withdraw(double amount){
        if(amount >=0.0 && amount <= balance){
            balance = balance - amount;
        }
        return balance;
    }

    // deposit method
    public  double deposit(double amount){
        if(amount >= 0.0){
            balance = balance + amount;
        }
        return  balance;
    }


    @Override
    public String toString() {
        return "iBankAccount{" +
                "balance=" + balance +
                '}';
    }
}
