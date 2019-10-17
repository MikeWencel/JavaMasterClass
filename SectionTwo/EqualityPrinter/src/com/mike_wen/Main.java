package com.mike_wen;

public class Main {

    public static void main(String[] args) {
	printEqual(-1,2,1);
    }

    public static void printEqual (int first,int second,int third){
        if ((first >= 0) && (second >= 0) && (third >= 0)) {
            if (first == second && second == third){
                System.out.println("All numbers are equal");
            }else if(first != second && second != third && third != first){
                System.out.println("All numbers are different");
            }else {
                System.out.println("Neither all are equal or different");
            }
        }else {
            System.out.println("Invalid Value");
        }
        }
    }

