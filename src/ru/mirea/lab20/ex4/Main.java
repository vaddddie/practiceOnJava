package ru.mirea.lab20.ex4;

public class Main {
    public static void main(String[] args) {
        MinMax<Integer> array = new MinMax<Integer>(new Integer[]{0, 1, 4, 12, 2, 4});
        System.out.printf("Array: %s\n", array);
        System.out.printf("Minimum array element: %s\n", array.min());
        System.out.printf("Maximum array element: %s\n", array.max());

        System.out.printf("Sum: %s\nMultiply: %s\n", Calculator.sum(2, 1), Calculator.multiply(5.4, 2));
        System.out.printf("Divide: %s\nSubtraction: %s\n", Calculator.divide(2, 1), Calculator.subtraction(5.4, 1));
    }
}