package com.company;

public class Main {

    public static void main(String[] args) {
	int array [] = {14,23,21,14,22,44,55};


	int count = 1;
	while (count > 0){
		count = 0;
	    for(int i =0;i < array.length-1;i++){
	        if(array[i] > array[i+1]){
	            int temp = array[i+1];
	            array[i+1] = array[i];
	            array[i] = temp;
                count++;
            }
        }

    }

        for (int i = 0; i < array.length-1 ; i++) {
            System.out.println(array[i]);
        }

    }
}
