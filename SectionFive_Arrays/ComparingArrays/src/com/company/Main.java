package com.company;

public class Main {

    public static void main(String[] args) {
	int arr[][] = {
            {3, 2, 2},
            {3, 2, 1},
            {2, 1, 1}
    };




        for (int i = 0; i < arr[i].length - 1; i++) {
            if (arr[i][0] == arr[i + 1][0] || arr[i][0] < arr[i + 1][0]) {

        }
    }

        for (int[] arry : arr) {
            for (int element : arry)
                System.out.print(element + " ");
            System.out.println(" ");
        }


    }
}
