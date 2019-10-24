package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(5,12000));
    }

    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        }else if(number % 2 != 0) {
            return true;
        }return false;
    }

    public static int sumOdd(int start,int end){
        if (start > end || start < 0){
            return -1;
        }else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
            return sum;
        }
    }
}
