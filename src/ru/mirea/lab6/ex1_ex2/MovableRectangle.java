package ru.mirea.lab6.ex1_ex2;

public class MovableRectangle implements Movable {
    private final MovablePoint point_1;
    private final MovablePoint point_2;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.point_1 = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.point_2 = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean checkingSpeeds(){
        return (point_1.xSpeed == point_2.xSpeed) && (point_1.ySpeed == point_2.ySpeed);
    }

    public void moveUp(){
        if(checkingSpeeds()){
            point_1.moveUp();
            point_2.moveUp();
        }
        else{
            System.out.println("The speeds of the points do not match");
        }
    }

    public void moveDown(){
        if(checkingSpeeds()){
            point_1.moveDown();
            point_2.moveDown();
        }
        else{
            System.out.println("The speeds of the points do not match");
        }
    }

    public void moveLeft(){
        if(checkingSpeeds()){
            point_1.moveLeft();
            point_2.moveLeft();
        }
        else{
            System.out.println("The speeds of the points do not match");
        }
    }

    public void moveRight(){
        if(checkingSpeeds()){
            point_1.moveRight();
            point_2.moveRight();
        }
        else{
            System.out.println("The speeds of the points do not match");
        }
    }

    public String toString() {
        return "MovableRectangle{" +
                "First point = " + point_1 +
                ", Second point = " + point_2 +
                '}';
    }
}