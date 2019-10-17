package com.mike_wen;

public class Main {

    public static void main(String[] args) {
	printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes > 0){
        int days = (int) minutes / 3600;
        int years = days / 365;
            System.out.println(minutes + " min = " + years + " years " + days + " days");
        }else {
            System.out.println("Invalid value");
        }

    }
}
