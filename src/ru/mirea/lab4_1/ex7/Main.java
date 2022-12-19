package ru.mirea.lab4_1.ex7;

public class Main {
    public static void main(String[] args) {
        SchoolChild[] persons = new SchoolChild[]{
                new Learner("Marilyn Monroe", 4.1, "11B", 11),
                new Learner("Abraham Lincoln", 4.9, "8A", 8),
                new Learner("Donald Trump", 3.2, "5B", 5),
                new Learner("Queen Elizabeth II", 5.0, "9D", 9),
                new Student("Muhammad Ali", 4.0, "IVBO-01-20", 3),
                new Student("Charles Darwin", 4.0, "KVBO-07-21", 2),
                new Student("Boris Ali", 4.0, "KSBO-01-21", 2),
        };

        System.out.println("Learners:");
        for (SchoolChild person : persons){
            if (person instanceof Learner){
                System.out.printf("%s\n", person.toString());
            }
        }

        System.out.println("Students:");
        for (SchoolChild person : persons){
            if (person instanceof Student){
                System.out.printf("%s\n", person.toString());
            }
        }
    }
}
