package ru.mirea.lab4_1.ex7;

public class Student extends SchoolChild{
    private int course;

    public Student(String full_name, double average_score, String group, int course){
        super(full_name, average_score, group);
        this.course = course;
    }
}
