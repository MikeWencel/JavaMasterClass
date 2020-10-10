package com.mikewencel;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(secondAnswer(5));
    }

    static String isEven (int number){
        if (number % 2 == 0){
            return "Even";
        }else {
            return "Odd";
        }
    }


    static String secondAnswer (int number){
        return (number % 2 == 0) ? "Even" : "Odd";
    }
}
