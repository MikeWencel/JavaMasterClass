package com.mikewencel;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        // Odwołuje się do pól klasy Rectangle
        super(width, length);
        // Uruchami pole height
        if(height < 0){
            this.height = 0;
        }else  {
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
