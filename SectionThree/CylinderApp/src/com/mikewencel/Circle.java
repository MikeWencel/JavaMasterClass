package com.mikewencel;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return (radius * radius * Math.PI);
    }
}
