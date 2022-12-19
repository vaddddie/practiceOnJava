package ru.mirea.lab4_1.ex1;

public class Rectangle extends Shape {
    public double side1;
    public double side2;

    public Rectangle(String type, double side1, double side2){
        super(type);
        this.side1 = side1;
        this.side2 = side2;
    }


    public String getType(){
        return type;
    }


    public double getArea(){
        return side1 * side2;
    }


    public double getPerimeter(){
        return 2 * (side1 + side2);
    }

    @Override
    public String toString(){
        return "Type of geometric shape: " + getType() +
                "\n Area of geometric shape: " + getArea() +
                "\n Perimeter of geometric shape: " + getPerimeter();
    }
}
