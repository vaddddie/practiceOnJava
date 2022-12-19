package ru.mirea.lab7.ex7_ex8;

public class Magazine implements Printable {
    String name;

    public Magazine(String name){
        this.name = name;
    }

    public static void printMagazines(Printable[] printable){
        for(Printable element : printable){
            if(element instanceof Magazine){
                element.print();
            }
        }
    }

    public void print(){
        System.out.println(name);
    }
}
