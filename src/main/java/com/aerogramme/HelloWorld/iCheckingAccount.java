package com.aerogramme.HelloWorld;

public class iCheckingAccount extends  iBankAccount{

    public iCheckingAccount(double balance) {
        super(balance);
    }

    double computerPay(double amount) {
        return amount / 100;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
