package com.mikewencel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] tab = new int [n][3];

        for(int i = 0;i < n;i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            tab[i][0] = x;
            tab[i][1] = y;
            tab[i][2] = z;
        }
        scanner.close();
        // Sortowanie wg. pierwszej liczby
        // Użycie sortowania bąbelkowego
        int ch = 1;
        while (ch > 0) {
            ch = 0;
            for (int i = 0; i < n - 1; i++) {
                if (tab[i][0] > tab[i + 1][0]) {
                    int[] temp = new int[]{tab[i][0], tab[i][1], tab[i][2]};
                    tab[i][0] = tab[i + 1][0];
                    tab[i][1] = tab[i + 1][1];
                    tab[i][2] = tab[i + 1][2];
                    tab[i + 1][0] = temp[0];
                    tab[i + 1][1] = temp[1];
                    tab[i + 1][2] = temp[2];
                    ch++;
                }
            }
        }

        int[] tmp = new int[3];
        for (int i = 0; i < n; i++)
        {
            if (i + 1 < n)
            {
                if (tab[i][ 0] > tab[i + 1][0])
                {
                    for (int j = 0; j < 3; j++)
                    {
                        tmp[j] = tab[i][j];
                        tab[i][ j] = tab[i + 1][ j];
                        tab[i + 1] [j] = tmp[j];
                    }
                }
            }
        }

        int[] tmp2 = new int[3];
        for (int i = 0; i < n; i++)
        {
            if (i + 1 < n)
            {
                if (tab[i][0] == tab[i + 1][0]){
                    if (tab[i][1] > tab[i + 1][1])
                    {
                        for (int j = 0; j < 3; j++)
                        {
                            tmp2[j] = tab[i][j];
                            tab[i][j] = tab[i + 1][j];
                            tab[i + 1][j] = tmp2[j];
                        }
                    }
                }
            }
        }

        int[] tmp3 = new int[3];
        for (int i = 0; i < n; i++)
        {
            if (i + 1 < n)
            {
                if (tab[i][0] == tab[i + 1][0])
                {
                    if (tab[i][2] > tab[i + 1][2])
                    {
                        for (int j = 0; j < 3; j++)
                        {
                            tmp3[j] = tab[i][j];
                            tab[i][j] = tab[i + 1][j];
                            tab[i + 1][j] = tmp3[j];
                        }
                    }
                }
            }
        }



        //Wydrukowanie tablicy
        for (int[] arry : tab) {
            for (int element : arry)
                System.out.print(element + " ");
            System.out.println(" ");
        }


    }
}