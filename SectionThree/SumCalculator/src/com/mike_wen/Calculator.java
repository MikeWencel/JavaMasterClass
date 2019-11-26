package com.mike_wen;

public class Calculator {

        public double firstNumber;
        public double secondNumber;

        public void setFirstNumber(double firstNumber) {
            this.firstNumber = firstNumber;
        }

        public void setSecondNumber(double secondNumber){
            this.secondNumber = secondNumber;
        }

        public double getFirstNumber(double firstNumber){
            return this.firstNumber;
        }

        public double getSecondNumber(double secondNumber){
            return this.secondNumber;
        }

        public double getAdditionResult(){
            return firstNumber + secondNumber;
        }

        public double getSubstractionResult(){
            return firstNumber - secondNumber;
        }

        public double getMultiplicationResult(){
            return firstNumber * secondNumber;
        }

        public double getDivisionResult(){
            if(secondNumber == 0){
                return 0;
            }else {
                return firstNumber / secondNumber;
            }

        }
    }

