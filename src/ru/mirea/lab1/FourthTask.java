package ru.mirea.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class FourthTask {
    public final int[] array = new int[10];

    public int sum = 0;
    public int max, min;

    public Scanner scanner = new Scanner(System.in);

    public void Arrange(){
        for (int item = 0; item < 10; item++){
            array[item] = (int)(Math.random() * 11);
        }

        Process();
    }

    private void Process(){
        int item = 0;

        max = array[item];
        min = array[item];

        do{
            sum += array[item];

            if (array[item] > max){
                max = array[item];
            }

            if (array[item] < min){
                min = array[item];
            }

            item++;
        }while(item < array.length);

        System.out.println(Arrays.toString(array));
        System.out.println("Sum = " + sum);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
