package ru.mirea.lab6.ex1_ex2;

public class MovableCircle implements Movable{
    private final int radius;
    private final MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp(){
        center.moveUp();
    }

    public void moveDown(){
        center.moveDown();
    }

    public void moveLeft(){
        center.moveLeft();
    }

    public void moveRight(){
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "Radius = " + radius +
                ", Center = " + center +
                '}';
    }
}
