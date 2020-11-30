package com.wencelmichael;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flag = "default";
        int numOne = 0;
        int numTwo = 1;
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            }
            String[] tab = str.split(" ");

            numOne = tab[0].length();
            numTwo = tab[2].length();

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
                                flag = "0";
                                break;
                            } else {
                                flag = "1";
                            }
                        }
                        System.out.println(flag);
                    }
                    break;
                    case ">=": {
                        for (int i = 0; i < first.length; i++) {
                            if (first[i] >= second[i]) {
                                flag = "1";
                            } else {
                                flag = "0";
                                break;
                            }
                        }
                        System.out.println(flag);
                    }
                    break;
                    case "<=": {
                        for (int i = 0; i < first.length; i++) {
                            if (first[i] <= second[i]) {
                                flag = "1";
                            } else {
                                flag = "0";
                                break;

                            }
                        }
                        System.out.println(flag);
                    }
                    break;
                    case "!=": {
                        for (int i = 0; i < first.length; i++) {
                            if (first[i] != second[i]) {
                                flag = "1";
                                break;
                            } else {
                                flag = "0";
                            }
                        }
                        System.out.println(flag);
                    }
                }
            } else {
                switch (tab[1]) {
                    case ">=": {
                        if (numOne > numTwo) {
                            System.out.println(1);
                        } else {
                            System.out.println(0);
                        }
                    }
                    break;
                    case "<=": {
                        if (numOne < numTwo) {
                            System.out.println(1);
                        } else {
                            System.out.println(0);
                        }
                    }
                    break;
                    case "!=": {
                        if (numOne != numTwo) {
                            System.out.println(1);
                        } else {
                            System.out.println(0);
                        }
                    }
                    break;

                    case "==": {
                        System.out.println(0);
                    }
                    break;
                    default:
                        System.out.println(0);
                        break;
                }
            }
        }
    }
}


