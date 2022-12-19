package ru.mirea.lab18.ex1;

public class Exception1 {
    public static void main(String[] args) {
        Exception1 main = new Exception1();
        main.exceptionDemo();
    }

    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        }
        catch (ArithmeticException exception) {
            System.out.println("Attempted division by zero");
        }
    }
}
