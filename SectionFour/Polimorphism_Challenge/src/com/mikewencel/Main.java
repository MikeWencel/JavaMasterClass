package com.mikewencel;

class Car {
    private boolean engine;
    private String name;
    private int wheels;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.engine = true;
        this.name = name;
        this.wheels = 4;
        this.cylinders = cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Engine started";
    }

}

class Mercedes extends Car{
    public Mercedes(){
        super("Mercedes",8);
    }

    @Override
    public boolean isEngine() {
        return super.isEngine();
    }
}

class Audi extends Car{
    public Audi(){
        super("Audi",4);
    }

    @Override
    public boolean isEngine() {
        return super.isEngine();
    }
}

class Mazda extends Car{
    public Mazda(){
        super("Mazda",6);
    }

    public boolean isEngine(){
        return super.isEngine();
    }
}


public class Main {

    public static void main(String[] args) {

        Car car = randomCar();
        System.out.println("Car: " +  car.getName() +" Status: " + car.startEngine()  +"\n" + "Cylinders " +  car.getCylinders());

    }

    public static Car randomCar(){
        int randomCar = (int) (Math.random() * 3) + 1;
        System.out.println("Random number was " + randomCar);

        switch (randomCar){
            case 1:
                return new Mercedes();
            case 2:
                return new Audi();
            case 3:
                return new Mazda();
        }
        return null;
    }
}
