package ru.mirea.lab7.ex5_ex6;

public class Main {
    public static void main(String[] args) {
        ProcessString strProcess = new ProcessString();

        String str = "Hallo world!";

        System.out.println(strProcess.char_number(str));
        System.out.println(strProcess.inverse(str));
        System.out.println(strProcess.odds_chars(str));
    }
}
