package com.mikewencel;

public class SUV extends Car {
    private int roadsService;

    public SUV(int roadsService) {
        super("Outlander", "4WD", 5, 5, 6, true);
        this.roadsService = roadsService;
    }

    public void accelerate(int rate){
       int newVelocity = getCurrentVelocity() + rate;
       if(newVelocity == 0) {
           stop();
           setCurrentGear(0);
       }else if(newVelocity > 0 && newVelocity <= 30){
           setCurrentGear(1);
       }
       else if(newVelocity > 30 && newVelocity <= 60){
           setCurrentGear(2);
       }
       else if(newVelocity > 60 && newVelocity <= 90){
           setCurrentGear(3);
       }
       else if(newVelocity > 90 && newVelocity <= 130){
           setCurrentGear(4);
       }
       else if(newVelocity > 130 && newVelocity <= 170){
           setCurrentGear(5);
       }else {
           setCurrentGear(6);
       }

       if (newVelocity > 0) {
           changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
