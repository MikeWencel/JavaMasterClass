package com.mikewencel;

public class Size {
    private int width;
    private int height;
    private int length;

    public Size(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public double getArea(){
        return width * length * height;
    }

    public void sizeOfRoom(){
        System.out.println("Size of the room is " + getArea());
    }

}
