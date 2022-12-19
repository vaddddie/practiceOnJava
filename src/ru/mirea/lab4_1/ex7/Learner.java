package ru.mirea.lab4_1.ex7;

public class Learner extends SchoolChild{
    private int class_;

    public Learner(String full_name, double average_score, String group, int class_){
        super(full_name, average_score, group);
        this.class_ = class_;
    }
}
