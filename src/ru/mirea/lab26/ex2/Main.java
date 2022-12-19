package ru.mirea.lab26.ex2;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 11; i++){
            list.add(i);
        }

        Iterator_beta<Integer> iterator = new Iterator_beta<>(list);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(iterator.list.size());
    }
}