package com.mikewencel;

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
        for (int i = 0; i < tab.length-1; i++)
        {
            for (int j = 0; j < tab.length - 1; j++)
            {
                for (int b = 0; b < tab[j].length;)
                {
                    if (tab[j][b] == tab[j + 1][b])
                    {
                        n += 2;
                        if (tab[j][b] == tab[j + 1][b])
                        {
                            n += 2;
                            if (tab[j][b] > tab[j + 1][b])
                            {
                                int[] t = tab[j];
                                tab[j] = tab[j + 1];
                                tab[j + 1] = t;
                                break;
                            }
                        }
                        else if (tab[j][b] > tab[j + 1][b])
                        {
                            int[] t = tab[j];
                            tab[j] = tab[j + 1];
                            tab[j + 1] = t;
                            break;
                        }
                    }
                    else if (tab[j][b] > tab[j + 1][b])
                    {
                        int[] t = tab[j];
                        tab[j] = tab[j + 1];
                        tab[j + 1] = t;
                        break;
                    }
                    else
                    {
                        break;
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