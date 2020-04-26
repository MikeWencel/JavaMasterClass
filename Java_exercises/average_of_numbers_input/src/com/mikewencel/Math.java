package com.mikewencel;

import java.util.Scanner;

public class Math {
    private double first;
    private double second;
    private double third;

    public Math(double first, double second, double third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    Scanner scanner = new Scanner(System.in);



    public void question(double first, double second, double third){
        System.out.println("Give me three numbers and java will math the average of these numbers :)");
        first = scanner.nextDouble();
        second = scanner.nextDouble();
        third = scanner.nextDouble();
    }


    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double getThird() {
        return third;
    }

    public void setThird(double third) {
        this.third = third;
    }

    public double average(){
        return (first + second + third) / 3;
    }

    public void writeAverage(){
        System.out.println("Average of these numbers is " + average());
    }


}
