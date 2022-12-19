package ru.mirea.lab2.ex8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] array;

    public static void main(String[] args){
        array = scanner.nextLine().split(" ");

        for (int index = 0; index < Math.floor(array.length / 2); index++){
            String temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
