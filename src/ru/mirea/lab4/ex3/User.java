package ru.mirea.lab4.ex3;

public class User {
    private final String name;
    private final int password;

    public User(String name, String password){
        this.name = name;
        this.password = password.hashCode();
    }

    public String getName(){
        return this.name;
    }

    public int getPassword(){
        return this.password;
    }
}
