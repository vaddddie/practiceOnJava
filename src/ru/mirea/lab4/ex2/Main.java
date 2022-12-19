package ru.mirea.lab4.ex2;

public class Main {
    private final Clothes[] clothes = {
            new Pants(Sizes.L, 1200.F, "red"),
            new Skirt(Sizes.M, 1341.F, "blue"),
            new Tie(Sizes.XXS, 13432.F, "yellow"),
            new TShirt(Sizes.XS, 1421.F, "white"),
            new Pants(Sizes.L, 2351.F, "black"),
            new Skirt(Sizes.L, 14133.F, "red"),
            new Pants(Sizes.XS, 11341.F, "brown"),
            new Tie(Sizes.S, 4151.F, "pink")
    };

    private final Atelier atelier = new Atelier();

    public static void main(String[] args) {
        Main main = new Main();
        main.atelier.dressMen(main.clothes);
        System.out.println("\n");
        main.atelier.dressWomen(main.clothes);
    }
}
