package ru.mirea.lab4.ex2;


public class Clothes {
    private Sizes size;
    private float price;
    private String color;

    public Clothes(Sizes size, float price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Sizes getSize(){
        return this.size;
    }

    public float getPrice(){
        return this.price;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return "Size: " + size + ", price: " + price + ", color: " + color + ". " + size.getDescription() + "\n";
    }
}
