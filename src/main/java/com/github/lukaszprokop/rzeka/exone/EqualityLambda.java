package com.github.lukaszprokop.rzeka.exone;

/**
 * następne zadanie {@link com.github.lukaszprokop.rzeka.extwo.Fibonacci}
 */
class EqualityLambda {

    //TODO: Napraw program nie zmieniając metody 'main()'
    public static void main(String[] args) {

        Container<Integer, Integer, Integer> container =
                (a, b, c) -> a.equals(b) && b.equals(c);

        int a = 2 * 2;
        int b = Math.addExact(2, 2);
        int c = Math.multiplyExact(2, 2);

        boolean check = container.check(a, b, c);

        System.out.printf("check() powinien zwracać 'true' i zwraca: %s", check);
    }
}
