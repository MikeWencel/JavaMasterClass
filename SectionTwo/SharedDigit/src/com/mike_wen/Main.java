package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(22,23));
    }

    // Prawda jest taka, że nie potrzeba tu pętli :P, ale cóż.... jak się jest upartym osłem, to się próbuje :=) !!!
    // Poniżej lepsze rozwiązanie :-)

    public static boolean hasSharedDigit(int first,int second){
        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        int numberFour = 0;

        if (first < 10 || first > 99 || second > 99 || second < 10){
            return false;
        }else {
             numberOne = first % 10;
             first = first / 10;
             numberTwo = first % 10;

             numberThree = second % 10;
             second = second / 10;
             numberFour = second % 10;


         }

         if (numberOne == numberThree){
             return true;
         }else if (numberOne == numberFour){
             return true;
         }else if (numberTwo == numberThree){
             return true;
         }else if (numberTwo == numberFour){
             return true;
         }else {
             return false;
         }

        }
    }

