package com.mike_wen;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("mercedes")){
            this.model = model;
        }else {
            this.model = "Unknown";
        }

    }

    // If you use a getter not only setter, you can print something

    public String getModel(){
        return this.model;
    }
}


