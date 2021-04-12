package com.github.lukaszprokop.rzeka.exthree;

import java.util.List;

class Letters {
    public static void main(String[] args) {
        Character[][] letters = new Character[][]{
                {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'},
                {'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
                {'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}
        };

        alphabetList(letters).forEach(System.out::println);
        System.out.println(alphabetString(letters));
    }

    private static List<Character> alphabetList(Character[][] letters) {
        //TODO: Zwróć alfabet w postaci listy małych znaków (lowercase),
        // postaraj się zrobić to w jednym strumieniu.
        // Nie zmieniaj sygnatury metody
        return null;
    }

    private static String alphabetString(Character[][] letters) {
        //TODO: Zwróć alfabet w postaci jednego stringa małych liter (lowercase)
        // (abcdefghijklmnopqrstuvwxyz), postaraj się zrobić to w jednym strumieniu.
        // Nie zmieniaj sygnatury metody
        return null;
    }
}
