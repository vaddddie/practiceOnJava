package ru.mirea.lab6.ex3_ex4;

public class Main {
    public static void main(String[] args) {
        Toy bear = new Toy("Bear", 13.99);
        Computer asus = new Computer("15rx01", 399.99);
        Smartphone samsung = new Smartphone("A7", 239.99);

        System.out.printf("%s\n%s\n%s", bear, asus, samsung);
    }
}
