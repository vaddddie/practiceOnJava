package ru.mirea.lab4.ex1;

public enum Season {
    WINTER(-30),
    SPRING(12),
    SUMMER(29),
    AUTUMN(9);

    private final int temperature;
    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature(){
        return this.temperature;
    }

    public String getDescription(){
        if (this.temperature < 20){
            return "Cold season";
        } else {
            return "Warm season";
        }
    }
}
