package ru.mirea.lab3.shell.ex1;

import java.lang.reflect.Type;
import java.util.Random;

public class Main {
    private static Random rand = new Random();

    private static Double varA = Double.valueOf(rand.nextDouble(10));
    private static Double varB = Double.parseDouble("121238.12");

    private static byte byteVar;
    private static short shortVar;
    private static int intVar;
    private static long longVar;
    private static float floatVar;
    private static double doubleVar;

    private static String doubleString;

    public static void main(String[] args) {
        System.out.println(varA);
        System.out.println(varB);

        byteVar = varB.byteValue();
        shortVar = varB.shortValue();
        intVar = varB.intValue();
        longVar = varB.longValue();
        floatVar = varB.floatValue();
        doubleVar = varB.floatValue();

        System.out.println(
                byteVar + " " +
                shortVar + " " +
                intVar + " " +
                longVar + " " +
                floatVar + " " +
                doubleVar
        );

        doubleString = Double.toString(varA);

        System.out.println(doubleString + " " + doubleString.getClass());
    }
}
