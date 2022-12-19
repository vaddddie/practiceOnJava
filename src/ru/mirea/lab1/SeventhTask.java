package ru.mirea.lab1;

import java.util.Scanner;

public class SeventhTask {
    public Scanner scanner = new Scanner(System.in);

    public int number;

    public void Factorial(){
        number = scanner.nextInt();
        int ans = 1;

        switch (number){
            case 0, 1:
                break;
            default:
                while(number != 1) {
                    ans *= number;
                    number -= 1;
                }
                break;
        }

        System.out.println(ans);
    }
}
