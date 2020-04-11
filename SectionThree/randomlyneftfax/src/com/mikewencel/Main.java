package com.mikewencel;

public class Main {

    public static void main(String[] args) {
        Person personNeflix = new Person();
        personNeflix.setFirstName("Mike");
        personNeflix.setLastName("Kaskader");
        System.out.println("Full name is: " + personNeflix.getFullName() + " from VEGAN COMPANY");

        System.out.println(Payments(27));

        }



    public static String Payments (int price){
    int sum = 0;
    int count = 1;
    while (sum < 80000){
        sum = price * count;
        count++;

    }
    int year = count / 12;
    int months = count % 12;

    return "Musiałbyś nie płacić przez " + year + " lat i " + months + " miesięcy, aby zrównać się z saldem Vegana";


    }



}
