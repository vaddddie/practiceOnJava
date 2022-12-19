package ru.mirea.lab2.ex2;

import java.util.Scanner;

public class TestBall {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        Ball ironBall = new Ball();

        System.out.println("x = " + ironBall.getX() + " y = " + ironBall.getY());

        int temp_x = scanner.nextInt();
        int temp_y = scanner.nextInt();

        ironBall.move(temp_x, temp_y);

        System.out.println("x = " + ironBall.getX() + " y = " + ironBall.getY());
    }
}
