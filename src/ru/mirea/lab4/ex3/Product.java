package ru.mirea.lab4.ex3;

public class Product {
    private final Catalogs type;
    private final String name;
    private final int price;

    public Product(Catalogs type, String name, int price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public Catalogs getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString(){
        String type_ = null;
        switch (this.type){
            case Child_watches -> {type_ = "Child's watch ";}
            case Men_watches -> {type_ = "Men's watch ";}
            case Women_watches -> {type_ = "Women's watch ";}
        }
        return type_ + name + ". Price: " + price;
    }
}
