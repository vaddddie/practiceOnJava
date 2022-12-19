package ru.mirea.lab4.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    public boolean logIn;
    private final ArrayList<User> users = new ArrayList<User>();
    private final Product[] products = {
            new Product(Catalogs.Child_watches, "RX-1300", 120),
            new Product(Catalogs.Men_watches, "ROLEX", 1150),
            new Product(Catalogs.Men_watches, "BOVET", 1000),
            new Product(Catalogs.Women_watches, "BLANCPAIN", 1420),
            new Product(Catalogs.Women_watches, "ROLEX", 1250),
    };

    public static void main(String[] args) {
        Manage manage = new Manage();
        manage.init();
        manage.run();
    }

    public void init(){
        logIn = false;
    }

    public void run(){
        while (true){
            if (!logIn){
                System.out.println(
                        """
                        0 - return
                        1 - Registration
                        2 - LogIn
                        """
                );
                Scanner scanner = new Scanner(System.in);

                int in_ = scanner.nextInt();
                switch (in_){
                    case 1 -> {Registration();}
                    case 2 -> {LogIn();}
                    default -> {return;}
                }
            } else {
                System.out.println(
                        """
                        0 - return
                        1 - Catalogs
                        2 - AllProducts
                        3 - LogOut
                        """
                );

                Scanner scanner = new Scanner(System.in);

                int in_ = scanner.nextInt();
                switch (in_){
                    case 1 -> {Catalogs();}
                    case 2 -> {PrintProducts();}
                    case 3 -> {LogOut();}
                    default -> {return;}
                }
            }
        }
    }

    private void Registration(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        users.add(new User(name, password));
        System.out.println("Done!\n");
    }

    private void LogIn(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a login: ");
        String name = scanner.nextLine();

        for (User user: users){
            if (user.getName().equals(name)){
                System.out.print("Enter a password: ");
                String password = scanner.nextLine();

                if (user.getPassword() == password.hashCode()){
                    logIn = true;
                    break;
                }
            }
        }
        if (!logIn){
            System.out.println("Wrong name!\n");
        }
    }

    private void Catalogs(){
        int index = 1;
        for (Catalogs item: Catalogs.values()){
            System.out.printf("%d. %s %n", index, item);
            index++;
        }
        Scanner scanner = new Scanner(System.in);

        int in_ = scanner.nextInt();
        switch (in_){
            case 1 -> {PrintProducts(Catalogs.Men_watches);}
            case 2 -> {PrintProducts(Catalogs.Women_watches);}
            case 3 -> {PrintProducts(Catalogs.Child_watches);}
            default -> {return;}
        }
    }

    private void PrintProducts(){
        for (Product item: products){
            System.out.println(item.toString());
        }
    }

    private void PrintProducts(Catalogs type){
        for (Product item: products){
            if (item.getType() == type){
                System.out.println(item.toString());
            }
        }
    }

    private void LogOut(){
        logIn = false;
    }
}
