package com.mikewencel;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height,double radius) {
        if (height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * getHeight();
    }
}
