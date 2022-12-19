package ru.mirea.lab25.ex3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        int[] months = new int[]{
                31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        int count = 0;
        String dates = "Prices:\n 29/02/2000 \n 30/04/2003 \n 01/01/2003 \n 29/02/2001 \n 30-04-2003 \n 1/1/1899";
        System.out.println(dates);

        String str = "(\\d{2})/(\\d{2})/(\\d{4})";

        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(dates);

        while (matcher.find()){
            int day = Integer.parseInt(matcher.group(1));
            int month = Integer.parseInt(matcher.group(2));
            int year = Integer.parseInt(matcher.group(3));

            if (year >= 1900 & year <= 9999){
                if (month > 0 & month <= 12){
                    if (day > 0 & day <= months[month - 1]){
                        if (day != 29 | month != 2 | year % 4 == 0){
                            count++;
                            System.out.println("Correct date format: " + matcher.group());
                        }
                    }
                }
            }
        }
        if (count == 0){
            System.out.println("No correct date formats were found");
        }
    }

}
