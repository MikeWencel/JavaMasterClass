package com.wencelmichael;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String[] tab = str.split(" ");


            if (tab[0].length() == tab[2].length()) {
                char[] first = new char[tab[0].length()];
                for (int i = 0; i < tab[0].length(); i++) {
                    first[i] = tab[0].charAt(i);
                }
                char[] second = new char[tab[2].length()];
                for (int i = 0; i < tab[2].length(); i++) {
                    second[i] = tab[2].charAt(i);
                }

                switch (tab[1]) {
                    case "==": {
                        for (int i = 0; i < first.length; i++) {
                            if (first[i] != second[i]) {
                                System.out.println(0);
                                break;
                            } else {
                                //String flaga
                            }
                        }
                    }
                    break;
                    case ">=": {
                        for (int i = 0; i < first.length; i++) {
                            if (first[i] <= second[i]) {
                                System.out.println(0);
                                break;
                            } else {
                                System.out.println(1);
                                break;
                            }
                        }
                    }
                    break;
                    case "<=": {
                        for (int i = 0; i < first.length; i++) {
                            if (first[i] >= second[i]) {
                                System.out.println(0);
                                break;
                            } else {
                                System.out.println(1);
                                break;
                            }
                        }
                    }
                    break;
                }
            }
            }
        scanner.close();
        }

    }

