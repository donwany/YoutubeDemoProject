package com.aerogramme.HelloWorld;

public class iSavingsAccount extends iBankAccount{

    public iSavingsAccount(double balance) {
        super(balance);
    }

    double computerPay(double amount) {
        return amount * 100;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
