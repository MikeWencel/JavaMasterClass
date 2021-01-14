package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] tab = new int[n][3];

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            tab[i][0] = x;
            tab[i][1] = y;
            tab[i][2] = z;
        }
        scanner.close();

        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                for (int j = 0; i < tab.length - 1; i++) {
                    if (tab[i][j] > tab[i + 1][j]) {
                        int[] temp = new int[]{tab[i][0], tab[i][1], tab[i][2]};
                        tab[i][0] = tab[i + 1][0];
                        tab[i][1] = tab[i + 1][1];
                        tab[i][2] = tab[i + 1][2];
                        tab[i + 1][0] = temp[0];
                        tab[i + 1][1] = temp[1];
                        tab[i + 1][2] = temp[2];
                        count++;
                    }
                    for (int z = 0; z < tab.length - 1; z++) {

                        if (tab[i][j] == tab[i + 1][j] && tab[i+1][j + 1] < tab[i][j+1]) {

                            int[] temp = new int[]{tab[i][0], tab[i][1], tab[i][2]};

                            tab[i][0] = tab[i + 1][0];
                            tab[i][1] = tab[i + 1][1];
                            tab[i][2] = tab[i + 1][2];

                            tab[i + 1][0] = temp[0];
                            tab[i + 1][1] = temp[1];
                            tab[i + 1][2] = temp[2];
                            count++;
                        }

                       if (tab[i][j] == tab[i + 1][j] && tab[i+1][j + 1] == tab[i][j+1] && tab[i+1][j + 2] < tab[i][j+2]) {
                            int[] temp = new int[]{tab[i][0], tab[i][1], tab[i][2]};
                            tab[i][0] = tab[i + 1][0];
                            tab[i][1] = tab[i + 1][1];
                            tab[i][2] = tab[i + 1][2];
                            tab[i + 1][0] = temp[0];
                            tab[i + 1][1] = temp[1];
                            tab[i + 1][2] = temp[2];
                            count++;
                        }
                    }
                }

            }

        }
        for (int[] arry : tab) {
            for (int element : arry)
                System.out.print(element + " ");
            System.out.println(" ");
        }
    }
    }
