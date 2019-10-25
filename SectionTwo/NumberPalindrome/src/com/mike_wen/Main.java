package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }


    public static boolean isPalindrome(int number){
        int reverse = 0;
        int num = number;
        if (number < 0){
            return false;
        }else {
            while (number > 0){
                reverse = reverse * 10;
                reverse = (number % 10) + reverse;
                number = number / 10;

            }
        }if (num == reverse){
            System.out.println(num + " is Palindrome, cause reverse number is the same number like first: " + num + " = " + reverse);
            return true;
        }return false;
    }
}
