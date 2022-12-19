package ru.mirea.lab30.ex1;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addNode(13);
        tree.addNode(11);
        tree.addNode(19);
        tree.addNode(14);
        tree.addNode(15);
        tree.addNode(110);
        tree.addNode(17);
        tree.addNode(18);
        tree.addNode(12);
        tree.addNode(16);

        System.out.println("Source tree:");
        tree.printTree();

        tree.reverse();
        System.out.println("\nMirror tree:");
        tree.printTree();

        System.out.println("\nChecking whether this tree contains element 110: " + tree.lookup(110));
        System.out.println("The maximum number of elements in the tree arranged horizontally: " + tree.getMaxWidth());
        System.out.println("Tree height: " + tree.height());
    }
}
