package com.aerogramme.HelloWorld;

import java.util.Date;

public class CrediCardMain {

    public static void main(String[] args) {
        // calling credit card class

        // Card belonging to Donald Trump
        CreditCard card = new CreditCard("Donald Trump",
                "45458484748383",
                new Date(2022, 5,1),
                new Date(2019, 9, 1),
                204,
                2500,
                "VISA",
                "123 main st",
                "Greater Accra",
                "Accra",
                "23321",
                "Ghana",
                1500);

        System.out.println("The balance on the credit card is :" + card.getBalance());
        System.out.println("The accountname on the credit card is :" + card.getAccountHolderName());
        System.out.println("The country on the credit card is :" + card.getCountry());
        System.out.println("The issuer on the credit card is :" + card.getIssuer());
        System.out.println("The expiration date on the credit card is :" + card.getExpirationDate());

        System.out.println("*********************************************************************************");

        card.pay(55);
        System.out.println("The balance on the credit card is :" + card.getBalance());


        // Another Credit Card belonging to Nana Addo
        CreditCard otherCard = new CreditCard("Nana Addo",
                "544758474374573",
                new Date(2022, 5,1),
                new Date(2019, 9, 1),
                204,
                1500,
                "MasterCard",
                "123 main st",
                "Greater Accra",
                "Accra",
                "23321",
                "Ghana",
                1200);

        boolean isTrue = card.isSimilar(otherCard);
        System.out.println("Is the two credit cards similar:" + isTrue);


        boolean trueCharge = card.charge(500);
        System.out.println("Is the amount charged on the credit card? :" + trueCharge);

        card.credit(450);
        System.out.println("The balance on the credit card is :" + card.getBalance());


        System.out.println(card.toString());






    }
}
