package com.mike_wen;

public class Main {
    public static void main(String[] args) {





//        int count = 1;
//
//        do {
//            System.out.println("Count calue was " + count);
//            count++;
//        }while (count !=6);
        System.out.println(isEvenNumber(2));

        int number  = 4;
        int finishNumber = 20;
        int evenNumbers = 0;
        while (number <= finishNumber){
            if (isEvenNumber(number)){
                System.out.println(number);
                evenNumbers++;

            }
            number++;

        }System.out.println("Even numbers found " + evenNumbers);
    }

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        }return false;
    }
}
