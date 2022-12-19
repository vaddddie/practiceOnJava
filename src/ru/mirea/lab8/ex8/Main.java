package ru.mirea.lab8.ex8;

public class Main {
    public boolean palindrome(String str){
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++){
            if (ch[i] != ch[ch.length - i - 1]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.palindrome("neveroddoreven"));
    }
}
