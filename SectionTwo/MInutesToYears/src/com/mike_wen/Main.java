package com.mike_wen;

public class Main {

    public static void main(String[] args) {
	printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes >= 0){
        int hour = (int) minutes / 60;
        int days = hour / 24;
        int newDays = days % 365;
        int years = days / 365;
            System.out.println(minutes + " min = " + years + " y and " + newDays + " d");
        }else {
            System.out.println("Invalid Value");
        }

    }
}
