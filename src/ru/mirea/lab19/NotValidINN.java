package ru.mirea.lab19;

public class NotValidINN extends RuntimeException{
    public NotValidINN(String message){
        super(message);
    }
}
