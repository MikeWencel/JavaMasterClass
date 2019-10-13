package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1024);
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(-5000);
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes){
        if (kilobytes < 0){
            System.out.println("Invalid Value");
        }else {

            int remainderKb = kilobytes % 1024;
            int megabytes = kilobytes / 1000;
            System.out.println(kilobytes +"KB = " + megabytes + "MB " + remainderKb + " KB" );
        }
    }
}
