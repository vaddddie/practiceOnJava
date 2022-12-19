package ru.mirea.lab4.ex2;

public class Tie extends Clothes implements MenClothing{

    public Tie(Sizes size, float price, String color) {
        super(size, price, color);
    }

    public void dressMan() {
        System.out.println("Men is dressed");
    }

    @Override
    public String toString() {
        return "TIE. " + super.toString();
    }
}