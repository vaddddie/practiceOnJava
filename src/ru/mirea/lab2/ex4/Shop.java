package ru.mirea.lab2.ex4;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static ArrayList<Computer> dataBase = new ArrayList<Computer>();

    private static boolean loop = true;

    public static void main(String[] args) {
        while(loop){
            System.out.println("0 - Search, 1 - Add, 2 - Remove: ");
            int choose = new Scanner(System.in).nextInt();

            switch (choose) {
                case 0 -> {
                    System.out.print("Search: ");
                    Search(new Scanner(System.in).nextLine().toCharArray());
                }
                case 1 -> {
                    System.out.print("Enter a computer name: ");
                    AddComputer(new Scanner(System.in).nextLine());
                }
                case 2 -> {
                    System.out.print("Enter a computer name: ");
                    RemoveComputer(new Scanner(System.in).nextLine());
                }
                default -> loop = false;
            }
        }
    }

    private static void Search(char[] field){
        int count = 0;

        System.out.println("Results: ");

        for (Computer item : dataBase){
            char[] title = item.title.toCharArray();

            for (char character : title){
                if (count < field.length){
                    if (character == field[count]) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count == field.length){
                    System.out.print(item.title + ", ");
                    break;
                }
            }
        }

        System.out.println();
    }

    private static void AddComputer(String title){
        boolean permission = true;

        for (Computer item : dataBase){
            if (item.title.equals(title)){
                permission = false;
                break;
            }
        }

        if (permission){
            dataBase.add(new Computer(title));
        } else {
            System.out.println("Error!");
        }
    }

    private static void RemoveComputer(String title){
        for (Computer item : dataBase){
            if (item.title.equals(title)){
                dataBase.remove(item);
                System.out.println("Congratulation!\n");
                break;
            }
        }
    }
}
