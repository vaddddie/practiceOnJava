package ru.mirea.lab7.ex4;

public class MathFunc implements MathCalculable{
    public double getCircleLength(double r){
        return 2 * pi * r;
    }

    public double getCircleArea(double r){
        return pi * pow(r, 2);
    }

    public double pow(double x, double n){
        return Math.pow(x, n);
    }

    public double cabs(double real, double image){
        return Math.sqrt(Math.pow(real, 2) + Math.pow(image, 2));
    }
}
