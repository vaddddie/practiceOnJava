package ru.mirea.lab3.formating;

import java.sql.SQLOutput;
import java.util.*;

public class ShopApplication {
    private Trade trade = new Trade();
    private ArrayList<Product> database = new ArrayList<Product>();

    private void init(){
        Collections.addAll(database,
                new Product("RX-100", 15.),
                new Product("RX-120", 20.),
                new Product("Milk", 2.),
                new Product("Cow", 12.)
        );
    }

    private void run(){
        while(true){
            System.out.println("Products(1 - " + database.size() + ") or Report(press 0):\n");
            System.out.println(Arrays.toString(database.toArray()));

            int productID = new Scanner(System.in).nextInt();

            if (productID != 0) {
                System.out.println("Currency: " + trade.rate);
                String currencyType = new Scanner(System.in).nextLine();

                Object ans = trade.Trading("Dollar", currencyType, database.get(productID - 1).price);
                System.out.println(ans);
            } else {
                Report report = new Report();
                report.generateReport();
            }
        }
    }

    public static void main(String[] args) {
        ShopApplication shop = new ShopApplication();
        shop.init();
        shop.run();
    }
}
