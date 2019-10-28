package com.mike_wen;

public class Main {

    public static void main(String[] args) {
       numberToWords(1092017);

    }

    public static int getDigitCount(int number){
        int count = 0;
        if (number > 0){
            while (number > 0){
            count++;
            number = number / 10;
            }return count;
        }else {
            return -1;
        }
    }


    public static int reverse(int number){
        int digit;
        int sum = 0;
        while (number != 0){
            digit = (number % 10);
            sum = sum + digit;
                if (number > 9){
                    sum = sum * 10;
                }


            number = number / 10;
        }return sum;
    }

    public static void numberToWords(int number){

        int count = getDigitCount(number);
        number = reverse(number);
        int loop = 0;
        int digit;
        if (number < 0){
            System.out.println("Invalid Value");
        }else {
            while (number != 0){

                loop++;
                digit = number % 10;
                number = number / 10;
                switch (digit){
                    case 0:
                        System.out.println("ZERO");
                        break;
                    case 1:
                        System.out.println("ONE");
                        break;
                    case 2:
                        System.out.println("TWO");
                        break;
                    case 3:
                        System.out.println("THREE");
                        break;
                    case 4:
                        System.out.println("FOUR");
                        break;
                    case 5:
                        System.out.println("FIVE");
                        break;
                    case 6:
                        System.out.println("SIX");
                        break;
                    case 7:
                        System.out.println("SEVEN");
                        break;
                    case 8:
                        System.out.println("EIGHT");
                        break;
                    case 9:
                        System.out.println("NINE");
                        break;


                }

            }
            while (loop != count){
                System.out.println("ZERO");
                loop++;
            }
        }
    }
}
