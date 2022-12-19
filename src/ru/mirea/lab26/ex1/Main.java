package ru.mirea.lab26.ex1;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i < 11; i++) {
            stack.add(i);
        }
        System.out.println("Original array:");
        System.out.println(stack);

        for (int j = 0; j < (stack.size() / 2); j++) {
            stack.add(j, stack.remove(stack.size() - j - 1));
            stack.add(stack.size() - j - 1, stack.remove(j + 1));
        }
        System.out.println("Inverted array:");
        System.out.println(stack);
    }
}
