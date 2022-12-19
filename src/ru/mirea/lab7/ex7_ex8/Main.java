package ru.mirea.lab7.ex7_ex8;

public class Main {
    public static void main(String[] args){
        Printable[] printable = new Printable[]{
                new Book("Harry Potter and the Half-Blood Prince", "J. K. Rowling"),
                new Book("Murder on the Orient Express", "Agatha Christie"),
                new Book("War and peace", "Leo Tolstoy"),
                new Magazine("Vogue"),
                new Magazine("Hello"),
                new Magazine("National Geographic")
        };

        System.out.println("Magazines:");
        Magazine.printMagazines(printable);
        System.out.println("\nBooks:");
        Book.printBooks(printable);
    }
}
