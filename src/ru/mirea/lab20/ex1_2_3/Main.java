package ru.mirea.lab20.ex1_2_3;

public class Main {
    public static void main(String[] args) {
        TVKClass<Integer, Integer, Animal> example = new TVKClass<Integer, Integer, Animal>(25, 12, new Animal());
        example.type();
    }
}
