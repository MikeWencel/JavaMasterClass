package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        isLeapYear(1924);
        getDaysInMonth(2,2002);


        System.out.println("1924 % 4  = " + 1924 % 4);
        System.out.println("1924 % 100  = " + 1924 % 100);

    }



    public static boolean isLeapYear(int year) {
        if (year > 0 && year <= 9999) {
            int isLeapYearFour = year % 4;
            if (isLeapYearFour == 0) {
                int isLeapYearHun = year % 100;
                if (isLeapYearHun == 0) {
                    int isLeapDivHun = year % 400;
                    if (isLeapDivHun == 0) {
                        return true;
                    } else return false;
                }return true;
            }
        }return false;

    }

    public static int getDaysInMonth(int month, int year) {
        int day;
        int days;
        if (month < 1 || month > 12) {
            return -1;
        } else if (year > 9999 || year < 1) {
            return -1;
        } else {
            if (isLeapYear(year)) {
                switch (month) {
                    case 1: case 3: case 5: case 7: case 8:  case 10: case 12:
                      return   days = 31;
                    case 2:
                        System.out.println("29 days");
                       return days = 29;

                    case 4: case 6: case 9: case 11:
                        System.out.println("30 days");
                       return days = 30;
                        default:
                            System.out.println("Invalid Value");

                }
            }else{
                switch (month) {
                    case 1: case 3: case 5: case 7: case 8:  case 10: case 12:
                        System.out.println("31 days");
                        return days = 31;
                    case 2:
                        System.out.println("29 days");
                        return days = 28;
                    case 4: case 6: case 9: case 11:
                        System.out.println("30 days");
                        return days = 30;
                    default:
                        System.out.println("Invalid Value");
                        return -1;


                }
            }return month;

        }
    }
}