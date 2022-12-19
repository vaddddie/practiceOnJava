package ru.mirea.lab7.ex7_ex8;

public class Book implements Printable{
    String name;
    String author;

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public static void printBooks(Printable[] printable){
        for(Printable item : printable){
            if(item instanceof Book){
                item.print();
            }
        }
    }

    public void print(){
        System.out.println(name + " (" + author + ")");
    }
}
