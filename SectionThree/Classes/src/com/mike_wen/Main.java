package com.mike_wen;

public class Main {

    public static void main(String[] args) {
        Car porshe =  new Car();
        Car mercedes = new Car();
        // Calling set model method, with object that is private

        // setting model = you can't print it.
        porshe.setModel("Carrera");


        // After using method getter you can print model
        // In java we use getter and setter
        System.out.println("Model is " + porshe.getModel());

    }
}
