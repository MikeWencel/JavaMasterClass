package com.mike_wen;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String ValidModel = model.toLowerCase();
        if (ValidModel.equals("190E") || ValidModel.equals("S40") ){
            this.model = model;
        }else {
            this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;
    }
}