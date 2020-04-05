package com.mikewencel;

public class Main {

    public static void main(String[] args) {

    bankAccount firstAccount = new bankAccount();

    firstAccount.setCustomerName("Baobab");
        System.out.println(firstAccount.getCustomerName());
    firstAccount.setNumber("14 0000 2322 5455 2768");
    firstAccount.setBalance(5000);
    firstAccount.deposit(5000);
        System.out.println(firstAccount.getBalance());


        System.out.println("Customer name: "
                + firstAccount.getCustomerName() +
                " account number is " +
                firstAccount.getNumber());

        firstAccount.withdrawal(150);
        System.out.println(firstAccount.getBalance());

    }


}
