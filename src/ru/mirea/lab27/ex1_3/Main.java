package ru.mirea.lab27.ex1_3;

public class Main {
    public static void main(String[] args) {
        HashTab hashtab = new HashTab();

        for (int i = 0; i < 10; i++){
            hashtab.add(i, i * 10);
        }

        System.out.println("HashTable:\n" + hashtab);
        System.out.println("The data with the key 5: " + hashtab.init(5));

        hashtab.delete(5);

        System.out.print("\nAfter deleting the data with the key 5:\n" + hashtab);
    }
}
