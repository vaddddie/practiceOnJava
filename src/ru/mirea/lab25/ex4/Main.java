package ru.mirea.lab25.ex4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public  static void main(String[] args){
        int count = 0;
        String emails = "Emails:\n user@example.com \n root@localhost \n myhost@@@com.ru \n @my.ru \n Julia String";
        System.out.println(emails);

        String str = "([a-zA-Z0-9_\\-.]+)@([a-zA-Z0-9_\\-.]+).([a-zA-Z]{2,5})";

        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(emails);

        while (matcher.find()){
            count++;
            System.out.println("Correct email format: " + matcher.group());
        }
        if (count == 0){
            System.out.println("No correct email formats were found");
        }
    }
}
