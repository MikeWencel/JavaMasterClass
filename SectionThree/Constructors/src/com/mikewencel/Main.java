package com.mikewencel;

public class Main {

    public static void main(String[] args) {

    bankAccount BobsAccount = new bankAccount("14 000 4444",2000,"Bob", "bobs@mail.com","566 877 545");
    BobsAccount.deposit(4000);
    BobsAccount.withdrawal(150);
    System.out.println("*********");

    bankAccount empty = new bankAccount();
    System.out.println(empty.getNumber());
    System.out.println(empty.getBalance());
    System.out.println(empty.getCustomerName());

        System.out.println("*************");
        System.out.println("VIP CUSTOMERS");

        VipCustomer firstPerson = new VipCustomer();
        System.out.println(firstPerson.getName());

        VipCustomer secondPerson = new VipCustomer("George",2000);
        System.out.println(secondPerson.getName());

        VipCustomer thirdPerson = new VipCustomer("Joshua",5000,"joshua323214@gmail.com");
        System.out.println(thirdPerson.getName());
        System.out.println(thirdPerson.getEmail());


    }


}
