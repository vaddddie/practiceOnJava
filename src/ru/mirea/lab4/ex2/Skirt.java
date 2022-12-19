package ru.mirea.lab4.ex2;

public class Skirt extends Clothes implements WomenClothing{

    public Skirt(Sizes size, float price, String color) {
        super(size, price, color);
    }

    public void dressWomen() {
        System.out.println("Women is dressed");
    }

    @Override
    public String toString() {
        return "SKIRT. " + super.toString();
    }
}