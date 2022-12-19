package ru.mirea.lab18.ex3;
import ru.mirea.lab18.ex2.Exception2;

import java.util.Scanner;


public class Exception3 {
    public static void main(String[] args) {
        Exception3 main = new Exception3();
        main.exceptionDemo();
    }

    public void exceptionDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        String intString = scanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}