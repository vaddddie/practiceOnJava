package ru.mirea.lab4.ex2;

public class TShirt extends Clothes implements MenClothing, WomenClothing{

    public TShirt(Sizes size, float price, String color) {
        super(size, price, color);
    }

    public void dressMan() {
        System.out.println("Men is dressed");
    }

    public void dressWomen() {
        System.out.println("Women is dressed");
    }

    @Override
    public String toString() {
        return "TSHIRT. " + super.toString();
    }
}
