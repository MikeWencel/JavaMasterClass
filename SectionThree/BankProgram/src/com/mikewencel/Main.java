package com.mikewencel;

public class Main {

    public static void main(String[] args) {
	Investment First = new Investment();
        System.out.println(First.FirstYear(14000,0.4));
        System.out.println(First.secondYear(19600));
        System.out.println(First.thirdYear(18100,0.12));
    }
}
