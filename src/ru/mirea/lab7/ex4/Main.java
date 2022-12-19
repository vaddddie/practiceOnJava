package ru.mirea.lab7.ex4;

public class Main {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();

        System.out.printf("2^6 = %f, abs(2 + 6i) = %f\n", math.pow(2, 6), math.cabs(2, 6));
        System.out.printf("Length: %f\nArea: %f", math.getCircleLength(10), math.getCircleArea(10));
    }
}
