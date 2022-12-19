package ru.mirea.lab23.ex1;

public class ArrayQueue {
    public static void main(String[] args) {
        int size = 5;
        ArrayQueueModule<Integer> array = new ArrayQueueModule<>(size);
        array.delete();

        for(int i = 1; i <= size; i++) {
            array.insert("Element " + i);
        }
        System.out.println();
        array.display();

        System.out.println();
        array.delete();

        System.out.println();
        array.display();
    }
}