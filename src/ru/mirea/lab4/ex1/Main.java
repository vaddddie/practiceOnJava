package ru.mirea.lab4.ex1;

public class Main {
    private final static Season season = Season.WINTER;

    public static void main(String[] args) {
        System.out.printf("%-7s %11s %n", "Season", "Temperature");
        System.out.printf("%-7s %11s %n", season, season.getTemperature());

        for (Season item: season.values()){
            print_season(item);
        }
    }

    private static void print_season(Season season){
        switch (season) {
            case WINTER -> {System.out.println(
                    "I love winter. Temperature: " + season.getTemperature() + ". " + season.getDescription()
            ); break;}
            case SPRING -> {System.out.println(
                    "I love spring. Temperature: " + season.getTemperature() + ". " + season.getDescription()
            ); break;}
            case SUMMER -> {System.out.println(
                    "I love summer. Temperature: " + season.getTemperature() + ". " + season.getDescription()
            ); break;}
            case AUTUMN -> {System.out.println(
                    "I love autumn. Temperature: " + season.getTemperature() + ". " + season.getDescription()
            ); break;}
        }
    }
}
