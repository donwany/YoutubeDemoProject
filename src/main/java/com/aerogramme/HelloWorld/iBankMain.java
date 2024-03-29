package com.aerogramme.HelloWorld;

public class iBankMain {
    public static void main(String[] args) {

        // instantiate the IBankAccount
        //iBankAccount iBankAccount = new iBankAccount(100);
        iBankAccount iBankAccount = new iCheckingAccount(500);
        iBankAccount iBankAccount1 = new iSavingsAccount(1000);

        iCheckingAccount iCheckingAccount = new iCheckingAccount(200);
        iSavingsAccount iSavingsAccount = new iSavingsAccount(300);


        //System.out.println("The balance in your iBankAccount is :" + iBankAccount.getBalance());
        System.out.println("The balance in your iCheckingAccount is :" + iCheckingAccount.getBalance());
        System.out.println("The balance in your iSavingsAccount is :" + iSavingsAccount.getBalance());

        System.out.println("**************************************************************************");

        //System.out.println("You have depositing some amount in your account: " + iBankAccount.deposit(100));
        System.out.println("You are depositing an amount into your checking account :" + iCheckingAccount.deposit(200));
        System.out.println("You are depositing an amount into your savings account: " + iSavingsAccount.deposit(300));

        System.out.println("**************************************************************************");

        //System.out.println("You have withdrawing some amount from your account: " + iBankAccount.withdraw(50));
        System.out.println("You are withdrawing  an amount from your checking account :" + iCheckingAccount.withdraw(20));
        System.out.println("You are withdrawing an amount from  your savings account: " + iSavingsAccount.withdraw(70));

        System.out.println("**************************************************************************");
        //System.out.println(iBankAccount.toString());
        System.out.println(iCheckingAccount.toString());
        System.out.println(iSavingsAccount.toString());

        // Creating Abstract Class -- cannot be instantiated -- meaning you cant use the new keyword

        double result = iBankAccount.computerPay(1500);
        System.out.println("The computed salary is = " + result);

        double output = iBankAccount1.computerPay(1500);
        System.out.println("The computed wage is = " + output);

        System.out.println(iBankAccount1.toString());
        System.out.println(iBankAccount.toString());



    }



}
