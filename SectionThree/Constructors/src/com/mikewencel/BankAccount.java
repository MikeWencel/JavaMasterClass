package com.mikewencel;

public class BankAccount {



    private String accountNumber;
    private String customerName;
    private String email;
    private String phoneNumber;
    private double balance;

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("deposit of " + depositAmount + ". New balance is " + balance);
    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " avaible. Withdrawal not processed");
        }else {
            this.balance =- withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}


