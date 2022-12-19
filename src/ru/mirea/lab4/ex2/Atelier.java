package ru.mirea.lab4.ex2;

public class Atelier {
    public void dressMen(Clothes[] clothes){
        System.out.println("MENS:\n");
        for (Clothes item: clothes){
            if (MenClothing.class.isAssignableFrom(item.getClass())) {
                System.out.printf(item.toString());
            }
        }
    }

    public void dressWomen(Clothes[] clothes){
        System.out.println("WOMENS:\n");
        for (Clothes item: clothes){
            if (WomenClothing.class.isAssignableFrom(item.getClass())) {
                System.out.printf(item.toString());
            }
        }
    }
}
