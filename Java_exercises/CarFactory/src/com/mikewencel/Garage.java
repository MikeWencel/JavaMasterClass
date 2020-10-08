package com.mikewencel;

public class Garage {
    private String adress;
    private int garageCapacity;
    private int carAmount = 0;
    private Car [] cars;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getGarageCapacity() {
        return garageCapacity;
    }

    public void setGarageCapacity(int garageCapacity) {
        this.garageCapacity = garageCapacity;
    }

    public int getCarAmount() {
        return carAmount;
    }

    public void setCarAmount(int carAmount) {
        this.carAmount = carAmount;
    }

    public Garage(){
        this("Unknown",0,0);
    }

    public Garage(String adress,int garageCapacity, int carAmount){
        this.adress = adress;
        this.garageCapacity = garageCapacity;
        this.carAmount = carAmount;
    }

    public static void parkCar(String Car){

    }


}
