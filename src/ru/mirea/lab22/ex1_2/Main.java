package ru.mirea.lab22.ex1_2;


public class Main {
    public static void main(String[] args) {
        String[] tests = new String[]{
                "12 43 5 6",
                "12 234 /",
                "12 0 /",
                "12 45 + - +",
                "Hallo world!",
                "Hallo world! - = +- + - *"
        };

        for (String test : tests){
            System.out.printf("%s : %s\n", test, RPN.Do(test));
        }
    }
}
