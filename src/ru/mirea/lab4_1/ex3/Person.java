package ru.mirea.lab4_1.ex3;

import java.util.Random;

public class Person {
    private final String full_name;
    private final int age;

    private static final Random rand = new Random();
    private static final String[] default_names = new String[]{
            "Marilyn Monroe",
            "Abraham Lincoln",
            "Queen Elizabeth II",
            "Donald Trump",
            "Charles Darwin",
            "Muhammad Ali"
    };

    public Person(){
        //this.full_name = String.valueOf(rand.nextInt(default_names.length));
        this.full_name = default_names[rand.nextInt(default_names.length)];
        this.age = rand.nextInt(1, 99);
    }

    public Person(String full_name, int age){
        this.full_name = full_name;
        this.age = age;
    }

    public void talk(){
        System.out.printf("%s is talking\n", full_name);
    }

    public void move(){
        System.out.printf("%s is coming\n", full_name);
    }
}
