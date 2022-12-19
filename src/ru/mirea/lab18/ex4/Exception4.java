package ru.mirea.lab18.ex4;
import ru.mirea.lab18.ex2.Exception2;

import java.util.Scanner;


public class Exception4 {
    public static void main(String[] args) {
        Exception4 main = new Exception4();
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
        catch (ArithmeticException | NumberFormatException exception) {
            System.out.println("Error");
        }
        finally {
            System.out.println("It works");
        }
    }
}
