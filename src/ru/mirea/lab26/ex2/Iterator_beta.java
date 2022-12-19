package ru.mirea.lab26.ex2;

import java.util.Iterator;
import java.util.List;

public class Iterator_beta<T> implements Iterator<T> {
    public int pointer = 0;
    public List<T> list;

    public Iterator_beta(List<T> list){
        this.list = list;
    }

    @Override
    public boolean hasNext(){
        return this.pointer + 2 < this.list.size();
    }

    @Override
    public T next(){
        return this.list.get(this.pointer = this.pointer + 2);
    }
}