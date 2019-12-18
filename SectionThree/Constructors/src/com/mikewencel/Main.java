package com.mikewencel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount();
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(150);
        bobsAccount.withdrawal(50.0);


    }




}
