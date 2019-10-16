package com.mike_wen;

public class Main {

    public static void main(String[] args) {
	getDurationString(80000);
    }

    public static int getDurationString(int minutes,int seconds){
        if (minutes > 0 && seconds >= 0 && seconds <= 59){
            int hours = minutes / 60;
            int remainderMinutes = minutes % 60;
            System.out.println(hours + "h " + remainderMinutes +"m " + seconds +"s ");
        }return -1;
    }

    public static int getDurationString(int seconds){
        if (seconds >= 0){
            int newMinutes = seconds / 60;
            int remainderSeconds = seconds % 60;
            System.out.println(seconds+"s " + " is: " + newMinutes + "m " + remainderSeconds + "s");
            return getDurationString(newMinutes,remainderSeconds);
        }return -1;
    }
}
