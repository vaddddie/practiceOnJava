package ru.mirea.lab26.ex3;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        for (int i = 1; i < 11; i++){
            list.add(i*10);
        }

        System.out.printf("List: %s\n", list);
        System.out.printf("Pop: %s\n", list.pop());
        System.out.printf("Element with index 2: %s\n", list.get(2));
        System.out.printf("Size: %s\n", list.size());

        System.out.print("Enumeration: ");
        for(int number : list){
            System.out.printf("%s, ", number);
        }
    }
}
