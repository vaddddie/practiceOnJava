package ru.mirea.lab18.ex2;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Exception2 main = new Exception2();
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
    }
}