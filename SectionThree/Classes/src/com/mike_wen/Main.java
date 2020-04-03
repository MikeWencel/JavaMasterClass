package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        Car mercedes = new Car();
        Car volvo = new Car();

        mercedes.setModel("190E");
        volvo.setModel("S40");

        System.out.println("Model is " + mercedes.getModel());
       
    }
}
