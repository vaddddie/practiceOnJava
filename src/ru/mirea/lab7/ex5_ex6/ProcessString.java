package ru.mirea.lab7.ex5_ex6;

public class ProcessString implements StringProcessor{
    public int char_number(String str){
        return str.length();
    }

    public String odds_chars(String str){
        char[] new_str = new char[Math.floorDiv(str.length(), 2)];
        char[] ch_str = str.toCharArray();

        for (int i = 0; i < str.length(); i += 2){
            new_str[i/2] = ch_str[i];
        }

        return new String(new_str);
    }

    public String inverse(String str){
        char[] new_str = new char[str.length()];
        char[] ch_str = str.toCharArray();

        for (int i = 0; i < str.length(); i++){
            new_str[i] = ch_str[str.length() - i - 1];
        }

        return new String(new_str);
    }
}
