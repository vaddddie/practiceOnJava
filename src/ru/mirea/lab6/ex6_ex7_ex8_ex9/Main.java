package ru.mirea.lab6.ex6_ex7_ex8_ex9;

import ru.mirea.lab6.ex3_ex4.Priceable;

public class Main {
    public static void main(String[] args) {
        Printable[] items = new Printable[]{
                new Book("In Search of Lost Time", 1913),
                new Book("Ulysses", 1904),
                new Book("Don Quixote", 1605),
                new Shop("Tesla", 2003, "USA"),
                new Shop("Samsung", 1938, "South Korea"),
                new Shop("Huawei", 1987, "Chine"),
        };

        for (Printable item : items){
            item.print();
        }
    }
}
