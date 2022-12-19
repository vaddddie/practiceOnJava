package ru.mirea.lab2.ex1;

import java.util.Scanner;

public class TestAuthor {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Author person = new Author("Jane", "jane@gmail.com", 'W');

        System.out.println(person.getEmail());
        String nextName = scanner.nextLine();
        person.setEmail(nextName);
        System.out.println(person.getEmail());

        System.out.println(person.toString());
    }
}
