package com.mike_wen;

public class Main {

    public static void main(String[] args) {
	isCatPlaying(false,25);
    }

    public static boolean isCatPlaying(boolean summer,int temperature){
    if ((summer) && temperature >= 25 && temperature <= 45){
        System.out.println("Cat is playing");
        return true;
    }else if(!summer && temperature <= 35 && temperature >= 25){
        System.out.println("Cat is playing couse is not summer");
        return true;
    }return false;
    }


    }
