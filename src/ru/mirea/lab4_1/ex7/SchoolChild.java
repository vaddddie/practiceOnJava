package ru.mirea.lab4_1.ex7;

public class SchoolChild {
    private String full_name;
    private double average_score;
    private String group;

    public SchoolChild(String full_name, double average_score, String group){
        this.full_name = full_name;
        this.average_score = average_score;
        this.group = group;
    }

    @Override
    public String toString(){
        return full_name + "|" + average_score;
    }
}
