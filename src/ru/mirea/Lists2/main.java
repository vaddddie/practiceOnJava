package ru.mirea.Lists2;

public class main {
    public static void main(String[] args) {
        SwapList list = new SwapList();
        list.add(4);
        list.add(19);
        list.add(6);
        list.add(1);
        list.add(3);
        list.add(2);

        System.out.println(list.toString());

        list.sort();

        System.out.println(list.toString());
    }
}
