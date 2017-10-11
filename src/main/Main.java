package main;

import demo.Example;

import static demo.NullabilityKt.printStringLength;

public class Main {

    public static void main(String[] args) {

//        printStringLength(null, null);
//        printStringLength("", null);

        Example example = new Example();
        System.out.println(example.getP());
    }
}
