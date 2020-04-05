package com.mikewencel;

public class bankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;


    public void deposit(double depositAmount){
        this.balance =+ depositAmount;

    }

    public void withdrawal(double withdrawalAmount){
        if (withdrawalAmount > this.balance){
            System.out.println("Insufficient money on your bank account");
        }else {
            this.balance =- withdrawalAmount;
            System.out.println(this.customerName + " withdrawal: " + withdrawalAmount);
        }

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
        System.out.println("actual bank balance is: " + balance);
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
