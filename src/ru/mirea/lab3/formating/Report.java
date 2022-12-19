package ru.mirea.lab3.formating;

import java.util.Random;

public class Report {
    private static final Random rand = new Random();
    private static final Employee[] Employees = {
            new Employee("Jack Reached", 13500),
            new Employee("John Mamba", 21000),
            new Employee("Jerry Olsen", 43500),
            new Employee("Tom Olsen", 32500),
            new Employee("Jessy Ham", 44500),
    };

    public static void generateReport(){
        for (Employee item:Employees){
            double salary = item.get_salary() + 0.15 * rand.nextInt(100);
            String salary_ = String.format("%.2f", salary);
            System.out.printf("%-15s %15s %n", item.get_Full_name(), salary_);
        }
    }
}
