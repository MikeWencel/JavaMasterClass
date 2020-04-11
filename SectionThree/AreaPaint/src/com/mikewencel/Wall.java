package com.mikewencel;

public class Wall {
    private double width;
    private double height;

    public Wall(){
        System.out.println("Empty constructor called");
    }

    public Wall(double width, double height){
        if (width < 0 || height < 0){
            this.height = 0;
            this.width = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double setWidth(double width){
        if (width < 0){
           return this.width = 0;
        }else {
            return this.width = width;
        }
    }

    public double setHeight(double height){
        if (height < 0){
            return this.height = 0;
        }else {
            return this.height = height;
        }
    }

    public double getArea(double width, double height){
        return width * height;
    }
}
