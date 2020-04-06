package com.mikewencel;

public class bankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public bankAccount() {
        System.out.println("empty constructor called");
    }

    public bankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance = balance + depositAmount;
        System.out.println("You deposit " + depositAmount + " cash. Your actuall bank balance is " + this.balance);

    }

    public bankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999",0.0,customerName,customerEmailAddress,customerPhoneNumber);

    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0){
            System.out.println("Insufficient money on your bank account, only balance available: " + this.balance);
        }else {
            this.balance = balance - withdrawalAmount;
            System.out.println(this.customerName + " withdrawal: " + withdrawalAmount + " actual balance is: " + this.balance);
        }

    }

    public void myBalance(){
        System.out.println("Your actual bank balance is: " + balance);
    }


    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress(){
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress){
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }


}
