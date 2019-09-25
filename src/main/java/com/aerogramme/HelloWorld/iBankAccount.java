package com.aerogramme.HelloWorld;

public class iBankAccount {

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
