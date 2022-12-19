package ru.mirea.lab3.ex2;

public class Circle {
    public Point center;
    public double radius;

    public Circle(int x, int y, double radius){
        center = new Point(x, y);
        this.radius = radius;
    }

    public double getLength(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle{x: " +
                center.x +
                ", y: " +
                center.y +
                ", radius: " +
                radius +
                "}\n";
    }
}
