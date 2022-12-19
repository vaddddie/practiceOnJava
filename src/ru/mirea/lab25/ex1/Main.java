package ru.mirea.lab25.ex1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public  static void main(String[] args){
        int count = 0;
        String prices = "Prices: \n 25.98 USD \n 44 ERR \n 0.004 EU \n 324.00 RUB \n 15.51 EU \n 99.999 RUB \n 500.25 CHF";
        System.out.println(prices);

        String str = "\\d+[.]\\d{2}\\s(USD|RUB|EU)";

        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(prices);

        while (matcher.find()){
            count++;
            System.out.println("Correct price format: " + matcher.group());
        }
        if (count == 0){
            System.out.println("No correct price formats were found");
        }
    }
}
