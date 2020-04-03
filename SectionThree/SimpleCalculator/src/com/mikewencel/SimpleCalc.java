package com.mikewencel;

public class SimpleCalc {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double setFirstNumber(double firstNumber) {
        return this.firstNumber = firstNumber;
    }

    public double setSecondNumber(double secondNumber) {
        return this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult(){
        return secondNumber - firstNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult(){
        if (secondNumber == 0){
            return 0;
        }else {
            return firstNumber / secondNumber;
        }
    }
}
