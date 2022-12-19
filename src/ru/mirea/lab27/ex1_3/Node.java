package ru.mirea.lab27.ex1_3;

public class Node {
    int hash;
    Object data;

    public Node(int hash, Object data){
        this.hash = hash;
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public int getHash() {
        return this.hash;
    }

    public void setData(Object dataValue) {
        data = dataValue;
    }

    @Override
    public String toString() {
        String output = "";
        output = "node data = " + data;
        return output;
    }
}
