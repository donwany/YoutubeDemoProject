package com.aerogramme.HelloWorld;

public class BankAccount {

    private int id;
    private String accountName;
    private double balance;
    private double transactionFees;


    public BankAccount(){

    }

    public BankAccount(int id, String accountName, double balance, double transactionFees) {
        this.id = id;
        this.accountName = accountName;
        this.balance = balance;
        this.transactionFees = transactionFees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTransactionFees() {
        return transactionFees;
    }

    public void setTransactionFees(double transactionFees) {
        if(transactionFees >= 0.0){
            this.transactionFees = transactionFees;
        }

    }

    // deposit

    public double deposit(double amount){
        if( amount >= 0.0 ){
            balance = balance + amount;
        }
        return balance;
    }

    // withdraw
    public double withdraw(double amount){
        if( amount >= 0.0  && amount <= balance){
            balance = balance - amount - transactionFees;
        }
        return balance;
    }

    // transfer money
    public boolean transfer(BankAccount other, double amount){
        if(balance >= amount){
            balance = balance - amount;
            other.balance = other.balance + amount;
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", transactionFees=" + transactionFees +
                '}';
    }
}
