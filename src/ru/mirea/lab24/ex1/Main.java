package ru.mirea.lab24.ex1;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory(4, 9);

        System.out.println(factory.createComplex());
        System.out.println(factory.createComplex(6, 12));
    }
}