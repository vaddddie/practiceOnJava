package ru.mirea.lab3.ex2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tester {
    private static Random rand = new Random();

    private static Circle[] data;

    public static void main(String[] args) {
        int size_ = new Scanner(System.in).nextInt();

        data = new Circle[size_];

        for (int i = 0; i < size_; i++) {
            data[i] = new Circle(
                    (int)(Math.random() * 10) - 5,
                    (int)(Math.random() * 10) - 5,
                    rand.nextDouble(15));
            System.out.println(data[i].center.x + " " + data[i].center.y + " " + data[i].radius);
        }

        quickSort(data, 0, data.length - 1);

        assert FindMaxCircle() != null;
        assert FindMinCircle() != null;
        System.out.println(
                "Max circle: " + FindMaxCircle().toString() + "\n" +
                "Min circle: " + FindMinCircle().toString() + "\n" +
                "Sorted array of circle:\n" + Arrays.toString(data)
        );
    }

    public static void quickSort(Circle[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        double pivot = source[(leftMarker + rightMarker) / 2].radius;
        do {
            while (source[leftMarker].radius < pivot) {
                leftMarker++;
            }

            while (source[rightMarker].radius > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Circle tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }

    public static Object FindMaxCircle(){
        if (data.length > 0){
            double maxRadius = data[0].radius;
            Circle maxCircle = data[0];

            for (Circle item : data){
                if (maxRadius <= item.radius){
                    maxRadius = item.radius;
                    maxCircle = item;
                }
            }

            return maxCircle;
        } else {
            return null;
        }
    }

    public static Object FindMinCircle(){
        if (data.length > 0){
            double minRadius = data[0].radius;
            Circle minCircle = data[0];

            for (Circle item : data){
                if (minRadius >= item.radius){
                    minRadius = item.radius;
                    minCircle = item;
                }
            }

            return minCircle;
        } else {
            return null;
        }
    }
}
