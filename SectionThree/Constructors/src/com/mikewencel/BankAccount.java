package com.mikewencel;

import java.util.Scanner;

public class BankAccount {

    Scanner scanner = new Scanner();

    private String accountNumber;
    public String customerName;
    public String email;
    public String phoneNumber;
    public double balance;

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

    public static double deposit(double number){
        System.out.println("How much money you want to put in your bank account");

    }
}


