package ru.mirea.lab1;

import java.util.Arrays;

public class MainClass {
    private static final ThirdTask thirdTask = new ThirdTask();
    private static final FourthTask fourthTask = new FourthTask();
    private static final SixthTask sixthTask = new SixthTask();
    private static final SeventhTask seventhTask = new SeventhTask();


    public static void main(String[] args){
        System.out.println("Third task:");
        thirdTask.Arrange();

        System.out.println("Fourth task:");
        fourthTask.Arrange();

        System.out.println("Fifth task:");
        for (String item : args){
            System.out.println(item);
        }

        System.out.println("Sixth task:");
        sixthTask.Process();
        System.out.println();

        System.out.println("Seventh task:");
        seventhTask.Factorial();
    }
}
