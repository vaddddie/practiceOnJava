package ru.mirea.lab2.ex10;

import java.util.Scanner;

public class HowMany {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mainText = scanner.nextLine().split(" ");

        System.out.println(mainText.length);
    }
}
