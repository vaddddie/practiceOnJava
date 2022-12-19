package ru.mirea.lab27.ex1_3;

import java.util.Arrays;

public class HashTab {
    private Node[] elements;
    private int size;

    public HashTab(){
        this.size = 0;
        elements = new Node[1];
    }

    public int hash(Object value){
        return value.hashCode();
    }

    public Object init(Object pre_key){
        for (Node item : elements){
            if (item != null){
                if (item.getHash() == pre_key.hashCode()){
                    return item.getData();
                }
            }
        }

        return null;
    }

    public void add(Object key, Object value){
        if (size == elements.length){
            lookUp();
        }

        elements[size++] = new Node(key.hashCode(), value);
    }

    public void lookUp(){
        elements = Arrays.copyOf(elements, elements.length + 1);
    }

    public boolean delete(Object key){
        if (size > 0){
            int position = -1;

            for (int i = 0; i < size; i++){
                if (key.hashCode() == elements[i].getHash()){
                    position = i;
                    break;
                }
            }

            if (position == -1){
                return false;
            }

            for (int i = position; i < size - 1; i++){
                elements[i] = elements[i + 1];
                elements[i + 1] = null;
            }

            size--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < size; i++){
            output.append(elements[i]).append("\n");
        }
        return output.toString();
    }
}
