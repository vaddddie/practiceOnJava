package ru.mirea.lab20.ex1_2_3;

import java.io.Serializable;

public class TVKClass<T extends Comparable<T>, K, V extends Animal & Serializable> {
    private final T type;
    private final K key;
    private final V value;

    public TVKClass(T type, K key, V value){
        this.type = type;
        this.key = key;
        this.value = value;
    }

    public T getType() {
        return type;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public void type(){
        System.out.printf(
                "Type's type: %s\nKey's type: %s\nValue's type: %s", type.getClass(), key.getClass(), value.getClass()
        );
    }
}
