package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1200,2400));

    }

    public static int getGreatestCommonDivisor(int first,int second){
        int lowest;
        int numOne;
        int numTwo;
        int digit = 0;
        if (first < 10 || second < 10){
            return -1;
        }else {
            if (first < second){
                lowest = first;
            }else {
                lowest = second;
            }

            for (int i = 2;i <= lowest;i++){
                numOne = first  % i;
                numTwo = second  % i;

                if (((numOne == 0) && (numTwo == 0))){
                digit = i;
                }





            }if (digit > 1){
                return digit;
            }else {
                return -1;
            }
        }
    }
}
