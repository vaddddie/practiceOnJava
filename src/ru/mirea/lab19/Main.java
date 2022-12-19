package ru.mirea.lab19;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try{
            main.run();
        } catch (NotValidINN e){
            e.printStackTrace();
        }
    }

    private boolean is_valid(String full_name, int INN){
        Random rand = new Random();
        return rand.nextBoolean();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        String full_name = scanner.nextLine();
        int INN = scanner.nextInt();

        if (is_valid(full_name, INN)){
            throw new NotValidINN("Not valid INN: " + INN);
        }

        System.out.println("Purchase completed!");
    }
}
