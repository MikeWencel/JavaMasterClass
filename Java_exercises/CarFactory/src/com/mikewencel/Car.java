package com.mikewencel;

public class Car {
    private String mark;
    private String model;
    private int doors;
    private int capacity;
    private double avgBurn;
    private static int carAmount = 0;



    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getAvgBurn() {
        return avgBurn;
    }

    public void setAvgBurn(double avgBurn) {
        this.avgBurn = avgBurn;
    }

    public Car(){
        this("Unknown","Unknown",0,0,0.0);
    }

    public Car(String mark,String model,int doors,int capacity,double avgBurn){
        this.mark = mark;
        this.model = model;
        this.doors = doors;
        this.capacity = capacity;
        this.avgBurn = avgBurn;
        carAmount++;
    }


    private static double avgFuelBurn(double routeLength){
        double fuelBurn = (routeLength * routeLength)/100;
        return fuelBurn;
      }

    public static double travelCost(double routeLength, double fuelPrice){
        double cost = (avgFuelBurn(routeLength)*fuelPrice);
        return cost;
    }

    public void writeInfo(){
        System.out.println("Marka:            " + this.mark);
        System.out.println("Model:            " + this.model);
        System.out.println("Drzwi:            " + this.doors);
        System.out.println("Pojemność:        " + this.capacity);
        System.out.println("Średnie spalanie: " + this.avgBurn);
    }

    public void  carInfoAmount(){
        System.out.println("Ilość samochodów " + carAmount);
    }


}
