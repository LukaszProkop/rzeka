package com.github.lukaszprokop.rzeka.extwo;

/**
 * Następne zadanie {@link com.github.lukaszprokop.rzeka.exthree.Letters}
 */
class Fibonacci {
    public static void main(String[] args) {
        // fibo(5) powinno zwrócić 7 (4+3)
        System.out.println(fibo(5));
    }

    private static int fibo(int n) {
        //TODO: zaimplementuj tę metodę używając strumieni tak aby przyjmowała index `n`
        // i zwracała liczbę z ciągu Fibonacciego która znajduje się pod tym intexem:
        // dla n = 0 fibo zwraca 0
        // dla n = 1 fibo zwraca 1
        // dla n > 1 fibo zwraca (n-1)+(n-2)
        return n;
    }
}
