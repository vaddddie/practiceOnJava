package ru.mirea.lab3.ex1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static double[] array;

    private static Random rand = new Random();

    public static void main(String[] args) {
        int size_ = new Scanner(System.in).nextInt();

        array = new double[size_];

        // Class Random method:
        for (int i = 0; i < size_; i++) {
            array[i] = rand.nextDouble();
        }

        // Math.random() method:
        for (int i = 0; i < size_; i++) {
            array[i] = Math.random();
        }
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
