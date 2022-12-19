package ru.mirea.lab4_1.ex1;

public class Main {
    public static void main(String[] args){
        Shape[] shape = new Shape[]{
                new Circle("circle", 5),
                new Rectangle("rectangle", 123, 75),
                new Square("square", 9)
        };
        for(Shape figure : shape){
            System.out.printf("%s\n\n", figure);
        }
    }
}
