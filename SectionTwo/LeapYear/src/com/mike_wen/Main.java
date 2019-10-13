package com.mike_wen;

public class Main {

    public static void main(String[] args) {


        System.out.println(isLeapYear(1924));

    }


    public static boolean isLeapYear(int year){
        if (year > 1 && year <= 9999){
            int isLeapFour = year % 4;
            System.out.println(isLeapFour);
            if (isLeapFour == 0) {
               int isLeapHun = year % 100;
               if (isLeapHun == 0){
                   int isLeapForHun = year % 400;
                   if (isLeapForHun == 0){
                       return true;
                   }else return false;
               }else return true;
            }


        }return false;
    }
}
