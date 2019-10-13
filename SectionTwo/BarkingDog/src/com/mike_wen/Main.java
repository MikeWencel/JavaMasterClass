package com.mike_wen;

public class Main {

    public static void main(String[] args) {
	shouldWakeUp(true,0);
    }

    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if ((barking) && (hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay >= 23 && hourOfDay < 24)){
            return true;
        }return false;
    }
}
