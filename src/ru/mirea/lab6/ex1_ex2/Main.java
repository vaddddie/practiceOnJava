package ru.mirea.lab6.ex1_ex2;


public class Main {
    public static void main(String[] args){
        // ex 1
        MovablePoint point = new MovablePoint(0, 0, 15, 15);
        System.out.printf("Point: 1 state:\n%s\n", point);
        point.moveUp();
        point.moveLeft();
        System.out.printf("Point: 2 state:\n%s\n\n", point);


        MovableCircle circle = new MovableCircle(0, 0, 5, 5, 7);
        System.out.printf("Circle: 1 state:\n%s\n", circle);
        circle.moveDown();
        circle.moveRight();
        System.out.printf("Circle: 2 state:\n%s\n\n", circle);


        // ex 2
        MovableRectangle rectangle = new MovableRectangle(1, 5, 5, 1, 10, 10);
        System.out.printf("Rectangle: 1 state:\n%s\n", rectangle);
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.printf("Rectangle: 2 state:\n%s\n", rectangle);
    }
}