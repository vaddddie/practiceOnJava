package ru.mirea.lab3.formating;

public class Employee {
    private final String full_name;
    private final float salary;

    public Employee(String full_name, float salary){
        this.full_name = full_name;
        this.salary = salary;
    }

    public float get_salary(){
        return salary;
    }

    public String get_Full_name(){
        return full_name;
    }
}
