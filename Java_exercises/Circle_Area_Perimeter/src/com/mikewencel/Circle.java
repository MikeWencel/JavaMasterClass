package com.mikewencel;


public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public void areaSize(){
        System.out.println("Size of area is " + getArea());
    }


    public double getPermiter(){
        return 2 * Math.PI * radius;
    }

    public void perimeterSize(){
        System.out.println("Size of perimeter is " + getPermiter());
    }

    public void allData(){
        areaSize();
        perimeterSize();
    }
}

