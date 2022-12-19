package ru.mirea.lab3.ex4and5;

import java.util.*;

public class Main {
    private static int n;
    private static int[] arr;
    private static final Stack<Integer> finalArray = new Stack<>();

    private static Random rand = new Random();

    public static void main(String[] args) {
        System.out.print("Enter a n: ");

        while(true){
            n = new Scanner(System.in).nextInt();

            if (n > 0){
                break;
            } else {
                System.out.print("Try again: ");
            }
        }

        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(n + 1);
        }

        System.out.println(Arrays.toString(arr));

        for (int item : arr) {
            if (item % 2 == 0){
                finalArray.push(item);
            }
        }

        System.out.println(Arrays.toString(finalArray.toArray()));
    }
}
