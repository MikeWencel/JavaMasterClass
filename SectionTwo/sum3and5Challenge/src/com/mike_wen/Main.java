package com.mike_wen;

public class Main {

    public static void main(String[] args) {

        sum3and5(1,1000);

    }

    public static void sum3and5(int first,int second){
        int n = 0;
        int b = 0;
        for (int i = first;i<= 1000;i++){
            if (i % 3 == 0 && i % 5 == 0){
                n = n + 1;
                System.out.println("This is number can be divide by 3 and 5 " + i);
                System.out.println(n);
                b = i + b;
            }if (n == 5){
                System.out.println(b);
                break;
            }
        }
    }
}
