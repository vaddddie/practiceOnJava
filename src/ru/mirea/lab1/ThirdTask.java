package ru.mirea.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdTask {
    public final int[] arr = new int[10];

    public int sum = 0;
    public float avg = 0;

    public Scanner scanner = new Scanner(System.in);

    public void Arrange(){
        for (int item = 0; item < 10; item++){
            arr[item] = (int)(Math.random() * 11);
        }

        Process();
    }

    public void Writing(){
        if (scanner.hasNextInt()){
            for (int item = 0; item < 10; item++){
                arr[item] = scanner.nextInt();
            }

            Process();
        }
    }

    private void Process(){
        for (int item : arr){
            sum += item;
        }

        avg = (float)sum / arr.length;

        System.out.println(Arrays.toString(arr));
        System.out.println("Sum = " + sum);
        System.out.println("AVG = " + avg);
    }
}
