package ru.mirea.lab4_1.ex3;

public class Main {
    public static void main(String[] args) {
        Person person_1 = new Person();
        Person person_2 = new Person("James Bond", 45);

        person_1.talk();
        person_2.move();
    }
}
