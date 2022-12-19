package ru.mirea.lab8.ex7;

import java.util.ArrayList;

public class Main {
    public ArrayList<Integer> numbers = new ArrayList<Integer>();
    public void multiplier(int x){
        for (int i = 2; i < x + 1; i++){
            if ((x % i) == 0){
                numbers.add(i);
                multiplier(x / i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Main main = new Main();

        main.multiplier(42513);
        System.out.printf("%s", main.numbers.toString());
    }
}
