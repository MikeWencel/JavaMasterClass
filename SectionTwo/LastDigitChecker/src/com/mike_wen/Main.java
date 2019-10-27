package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(1000,22,10));
    }

    public static boolean hasSameLastDigit(int first,int second, int third){
        int lastFirst;
        int lastSecond;
        int lastThird;
        if ((first >= 10 && first <= 1000) && (second >= 10 && second <= 1000) && (third >= 10 && third <= 1000)){
            lastFirst = first % 10;
            lastSecond = second % 10;
            lastThird = third % 10;

            if ((lastFirst == lastSecond) || (lastFirst == lastThird) || (lastSecond == lastThird)){
                return true;
            }
        }return false;
    }

    public static boolean isValid (int number){
        if ((number >= 10 && number <= 1000)){
            return true;
        }else {
            return false;
        }
    }
}
