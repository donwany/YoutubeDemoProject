package com.aerogramme.HelloWorld;

import java.util.Scanner;

public class BankAppMain {

    public static void main(String[] args) {

        // Call our bank app class
        BankApp app = new BankApp(1500, 1020, "JJ Rawlings");

        // declare a scanner class
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Get Balance");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the amount: ");
                    double amount = scanner.nextDouble();
                    app.withdraw(amount);
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Enter the amount: ");
                    double amountDeposit = scanner.nextDouble();
                    app.deposit(amountDeposit);
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Waiting to get balance ... ");
                    System.out.println("Welcome back! " + app.getNameOfAccountHolder() + ", Your balance is : $" + app.getBalance());
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("You have not made any choice, try to make one");
                    break;
                }

        }while (true);

    }
}
