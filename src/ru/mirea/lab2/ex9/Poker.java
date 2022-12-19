package ru.mirea.lab2.ex9;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Poker {
    private static ArrayList<String> mainPool = new ArrayList<String>();

    private static ArrayList<String> gamers = new ArrayList<String>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int n = scanner.nextInt();

        if (n < 11){
            FillingPool();

            for (int i = 0; i < n; i++){

                String localPool = " | ";

                for (int index = 0; index < 5; index++){
                    int choose = (int) (Math.random() * mainPool.size() - 1);

                    localPool += mainPool.get(choose) + " | ";
                    mainPool.remove(choose);
                }

                gamers.add(localPool);
            }

            for (String item : gamers) {
                System.out.println(item);
            }
        } else {
            System.out.println("Error");
        }
    }

    private static void FillingPool(){
        String[] suit = new String[] {
                "D",
                "H",
                "C",
                "S"
        };

        for (int i = 0; i < 4; i++){
            String[] tempArray = new String[] {
                    "2:" + suit[i],
                    "3:" + suit[i],
                    "4:" + suit[i],
                    "5:" + suit[i],
                    "6:" + suit[i],
                    "7:" + suit[i],
                    "8:" + suit[i],
                    "9:" + suit[i],
                    "10:" + suit[i],
                    "W:" + suit[i],
                    "D:" + suit[i],
                    "K:" + suit[i],
                    "T:" + suit[i]
            };

            mainPool.addAll(Arrays.asList(tempArray));
        }
    }
}


