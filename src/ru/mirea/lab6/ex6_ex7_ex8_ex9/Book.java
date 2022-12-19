package ru.mirea.lab6.ex6_ex7_ex8_ex9;

public class Book implements Printable{
    private final String name;
    private final int year;

    public Book(String name, int year){
        this.name = name;
        this.year = year;
    }

    public void print(){
        System.out.printf("%s - %d\n\n", name, year);
    }
}
