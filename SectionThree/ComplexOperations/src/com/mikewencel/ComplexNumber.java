package com.mikewencel;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber (double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber add){
        add(add.getReal(), add.getImaginary());
    }

    public void substract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;

    }

    public void substract(ComplexNumber substract){
        substract(substract.getReal(),substract.getImaginary());
    }


}
