package ru.mirea.lab3.formating;

public class Product {
    public String name;
    public double price;

    public static int ID = 1;
    public int id;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        id = ID;
        ID++;
    }

    @Override
    public String toString(){
        return id + ". " + name + " : " + price + "\n";
    }
}
