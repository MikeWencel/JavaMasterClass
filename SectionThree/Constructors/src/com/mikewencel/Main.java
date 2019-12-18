package com.mikewencel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount("44 5500 2244","Bob Sandwich",
                "bobsmailing@gmail.com","500 000 000", 2000);

        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(150);
        bobsAccount.withdrawal(50.0);
        System.out.println(bobsAccount.getBalance());


    }




}
