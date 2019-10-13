package com.mike_wen;

public class Main {

    public static void main(String[] args) {

       toMilesPerHour(-1);

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(0.0);

    }

    // 1 mile is 1.609 km




    public static long toMilesPerHour(double kmSpeed){
        if (kmSpeed > 0){
            double miles = kmSpeed / 1.609;
            return (long) miles;
        }else
            return -1;


    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            double milesPerHour = kilometersPerHour /1.609;
            milesPerHour = Math.round(milesPerHour);
            System.out.println(kilometersPerHour + " km/h = " + (int) milesPerHour +" mi/h");
        }
    }

}
