package ru.mirea.lab4.ex2;

public enum Sizes {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;
    Sizes(int euroSize){
        this.euroSize = euroSize;
    }

    public String getDescription(){
        if (euroSize != 32){
            return "Adult size";
        } else {
            return "Child size";
        }
    }
}
