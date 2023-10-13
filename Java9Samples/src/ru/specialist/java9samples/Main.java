package ru.specialist.java9samples;

import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;

interface Test {
    private void testImpl() {
        out.println("Test.testImpl");
    }
    default void test() {
        out.println("Test.test()");
        testImpl();
    }
}

public class Main {

    public static void main(String[] args) {
        out.println("Java 9 samples");
        // JShell

        // private method in interface
        (new Test(){}).test();

        // immutable collections
        List<String> list =
            List.of("один", "два", "три");
        for(String s : list)
            out.println(s);
        
        //list.add("четыре");

        // modules

        Scanner sc1 = new Scanner(System.in);

        //try (Scanner sc2 = new Scanner(System.in))
        try(sc1){


        }

    }
}
