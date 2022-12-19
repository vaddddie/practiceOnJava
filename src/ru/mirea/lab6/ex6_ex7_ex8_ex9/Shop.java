package ru.mirea.lab6.ex6_ex7_ex8_ex9;

public class Shop implements Printable{
    private final String name;
    private final int year;
    private final String address;

    public Shop(String name, int year, String address){
        this.name = name;
        this.year = year;
        this.address = address;
    }

    public void print(){
        System.out.printf("%s\nYear of foundation:%d Address:%s\n\n", name, year, address);
    }
}
