package com.mikewencel;

public class Main {

    public static void main(String[] args) {

    bankAccount baobabAccount = new bankAccount("232323",5000,"Baobab the cat","baobabthemail@gmail.com","34213213");
    bankAccount KateAccount = new bankAccount("14 5600 3323 0000 0000", 20000,"Kate the cat","Littlecat@gmail.com","324214214");
    bankAccount Timsaccount = new bankAccount("Tim","tima@fasfda2.com","56600032");
    baobabAccount.deposit(230);
    baobabAccount.withdrawal(1340);
    KateAccount.myBalance();
    KateAccount.deposit(4756);
    System.out.println(Timsaccount.getNumber() + " name " + Timsaccount.getCustomerName());



    }


}
