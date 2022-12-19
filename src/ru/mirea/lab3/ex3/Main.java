package ru.mirea.lab3.ex3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static int[] array = new int[4];

    private static Random rand = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(90) + 10;
        }

        System.out.println(Arrays.toString(array));

        boolean tmp = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]){
                tmp = false;
                break;
            }
        }

        System.out.printf(tmp ? "Increase" : "Does not increase");
    }
}
