package com.mikewencel;

public class Main {

    public static void main(String[] args) {
	//All about arrays - MW

    //Tworzę tablice 'numbers' o typie 'int' i numerach '{1,2,3}'
    int numbers[] = {1,2,3};
    //Wskazuję numer z tablicy, o indeksie 2
    System.out.println(numbers[2]);

    //Tworzę tablicę 'letters', o typie 'String' i literach '{"A","B","C","D"}'
    String letters[]={"A","B","C","D"};

    System.out.println(letters[0]);

    letters[0]= "Z";

    System.out.println(letters[0]);

        //Za pomocą pętli for przechodzę przez całą długość tablicy, po to mi jest potrzebne '.length'
        // .length mierzy długość tablicy, nie podaję indeksu liczy od numeru 1, czyli w 4 elementowym zbiorze znajdują się 4 litery.

        System.out.println(letters.length);

        for(int i = 0;i < letters.length;i++){
            System.out.println(letters[i]);
        }

        char[]alphabet = new char[26];
        int i = 0;
        for(char c = 'A'; c <= 'Z';c++){
            alphabet[i] = c;
            i++;
        }

        System.out.println(alphabet[5]);






    }
}
