package ru.mirea.lab18.ex5;

public class ThrowsDemo1 {
    public static void main(String[] args) {
        String message = getDetails("qwerty");
        System.out.println(message);
    }

    public static String getDetails(String key) {
        if (key.equals("qwerty")) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
}