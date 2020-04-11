package com.mikewencel;

public class Point {
    private int x;
    private int y;

    public Point(){
        System.out.println("Empty");
    }

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
       return Math.sqrt((0 - this.x) * (0 - this.x) + (0-this.y) * (0-this.y));

    }

    public double distance(int x,int y){
        return Math.sqrt((x - this.x) * (x - this.x) + (y -this.y) * (y - this.y));
    }

    public double distance(Point poi){
        return Math.sqrt((poi.x - this.x) * (poi.x - this.x) + (poi.y -this.y) * (poi.y - this.y));
    }
}
