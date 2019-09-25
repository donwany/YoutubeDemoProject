package com.aerogramme.HelloWorld;

public class BankAccountClass {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1020, "Donald Trump", 5000, 1);

        BankAccount other = new BankAccount(1021, "John Doe", 50, 1);


        // second day
        account.deposit(450);
        // third day
        account.deposit(1000);

        // 4th day
        account.withdraw(2500);

        System.out.println("The available balance is = " + account.getBalance());

        // 5th day
        account.withdraw(3000);
        System.out.println("The available balance is = " + account.getBalance());

        System.out.println(account.toString());

        // 6th day
        account.setAccountName("Nana Akuffo Addo Woyome");

        System.out.println(account.getAccountName());
        System.out.println(account.toString());

        // 7th day
        account.withdraw(948);
        System.out.println("The available balance is = " + account.getBalance());
        System.out.println(account.toString());

        System.out.println("********************************************************");

        account.deposit(990);
        account.deposit(600);

        System.out.println("The available balance is = " + account.getBalance());
        System.out.println("The available balance in other account is = " + other.getBalance());

        System.out.println("Money is been transferred from account to other account :" + account.transfer(other, 50));

        System.out.println("Checking to see if transfer was successful = " + other.getBalance());

        System.out.println("The available balance is = " + account.getBalance());

        System.out.println(account.toString());
        System.out.println(other.toString());




    }
}
