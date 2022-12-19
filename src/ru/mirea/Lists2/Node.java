package ru.mirea.Lists2;

public class Node {
    private Object data;
    private Node prev;
    private Node next;

    public Node(Object dataValue){
        prev = null;
        next = null;
        data = dataValue;
    }

    public Node(Object dataValue, Node prevValue, Node nextValue) {
        prev = prevValue;
        next = nextValue;
        data = dataValue;
    }

    // ========== about data =============

    public Object getData(){ return data; }

    public void setData(Object dataValue) { data = dataValue; }

    // ========== about next =============

    public Node getNext() { return next; }

    public void setNext(Node nextValue) { next = nextValue; }

    // ========== about prev =============

    public Node getPrev() { return prev; }

    public void setPrev(Node prevValue) { prev = prevValue; }

    // ===================================

    @Override
    public String toString() {
        String output ="";
        output = "node data="+data;
        return output;
    }
}
