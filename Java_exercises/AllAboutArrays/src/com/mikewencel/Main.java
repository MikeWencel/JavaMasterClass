package com.mikewencel;

public class Main {

    public static void main(String[] args) {
        //All about arrays - MW


        //Tworzę tablice 'numbers' o typie 'int' i numerach '{1,2,3}'
        int numbers[] = {1, 2, 3};
        //Wskazuję numer z tablicy, o indeksie 2
        System.out.println(numbers[2]);
        System.out.println("***********************************");
        //Tworzę tablicę 'letters', o typie 'String' i literach '{"A","B","C","D"}'
        String letters[] = {"A", "B", "C", "D"};
        System.out.println(letters[0]);

        letters[0] = "Z";

        System.out.println(letters[0]);
        System.out.println("***********************************");
        //Za pomocą pętli for przechodzę przez całą długość tablicy, po to mi jest potrzebne '.length'
        // .length mierzy długość tablicy, nie podaję indeksu liczy od numeru 1, czyli w 4 elementowym zbiorze znajdują się 4 litery.
        System.out.println("***********************************");
        System.out.println(letters.length);
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
        System.out.println("***********************************");
        char[] alphabet = new char[26];
        int v = 0;
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet[v] = c;
            v++;
        }

        System.out.println(alphabet[5]);
        System.out.println("***********************************");
        String[] firstArray = {"Blue", "Yellow", "Green", "Purple"};
        String[] secondArray = new String[10];
        System.out.println("Color on place 3 before loop in secondArray is: " + secondArray[2]);
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }
        System.out.println("Color on place 3 in secondArray is: " + firstArray[2]);
        System.out.println("Color on place 3 in secondArray is: " + secondArray[2]);
        System.out.println("***********************************");
        Enigma("Cesar");
    }

    public static void Enigma(String word) {
        //Po otrzymaniu słowa jako String word, przerabian word w tablice o typie CHAR
        char[] arr = word.toCharArray();
        //Mogę teraz według indeksu wyciągnać odpowiednią literę
        System.out.println(arr[2]);
        //Pętla przelatuje przez całą tablicę
        for (int i = 0; i < arr.length; i++) {
            //Tworzę zmienną INT o nazwie myIndex, która sprawdza numer CHAR w alfabecie
            int myIndex = arr[i];
            myIndex += 3;
            arr[i] = (char) myIndex;
        }
        System.out.println(arr);
    }


}
