package com.aerogramme.HelloWorld;

import java.util.Date;

public class CreditCard {

    private String accountHolderName;
    private String creditCardNumber;
    private Date expirationDate;
    private Date issuedDate;
    private int CVV;
    private int limit;
    private String issuer;
    private String billingAddress;
    private String state;
    private String city;
    private String zipCode;
    private String Country;
    private double balance;

    public CreditCard(){}

    public CreditCard(String accountHolderName, String creditCardNumber, Date expirationDate, Date issuedDate, int CVV, int limit, String issuer, String billingAddress, String state, String city, String zipCode, String country, double balance) {
        this.accountHolderName = accountHolderName;
        this.creditCardNumber = creditCardNumber;
        this.expirationDate = expirationDate;
        this.issuedDate = issuedDate;
        this.CVV = CVV;
        this.limit = limit;
        this.issuer = issuer;
        this.billingAddress = billingAddress;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
        Country = country;
        this.balance = balance;
    }

    public CreditCard(String accountHolderName, String creditCardNumber) {
        this.accountHolderName = accountHolderName;
        this.creditCardNumber = creditCardNumber;
    }

    public CreditCard(String accountHolderName, String creditCardNumber, int limit) {
        this.accountHolderName = accountHolderName;
        this.creditCardNumber = creditCardNumber;
        this.limit = limit;
    }


    public CreditCard(String accountHolderName, String creditCardNumber, int limit, String issuer) {
        this.accountHolderName = accountHolderName;
        this.creditCardNumber = creditCardNumber;
        this.limit = limit;
        this.issuer = issuer;
    }



    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // charge

    public boolean charge(double amount){
        if(amount >= 0.0 && balance >= amount){
            balance = balance + amount;
            return true;
        }else if (balance > limit){
            return false;
        }
        return false;
    }

    // credit
    public double credit(double amount){
        if( balance >= amount){
            balance = balance - amount;
        }
        return balance;
    }

    // pay
    public  void pay(double amount){
        if(amount >= 0.0 && balance >= amount){
            balance = balance - amount;
        }
    }

    // isSimilar
    public boolean isSimilar(CreditCard otherCard){
        return (balance - otherCard.balance) < 0.01;
    }



    @Override
    public String toString() {
        return "CreditCard{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", expirationDate=" + expirationDate +
                ", issuedDate=" + issuedDate +
                ", CVV=" + CVV +
                ", limit=" + limit +
                ", issuer='" + issuer + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", Country='" + Country + '\'' +
                ", balance=" + balance +
                '}';
    }
}
