package ru.mirea.lab26.ex3;
import java.util.Iterator;
import java.util.Arrays;


public class MyList<T> implements Iterable<T> {
    public int size = 0;
    public Object[] elements;

    public MyList(){
        this.elements = new Object[1];
    }

    public void expand(){
        this.elements = Arrays.copyOf(this.elements, this.elements.length + 1);
    }

    public void decrease(){
        this.elements = Arrays.copyOf(this.elements, this.elements.length - 1);
    }

    public void add(T object){
        if(this.size == elements.length){
            this.expand();
        }
        this.elements[this.size++] = object;
    }

    public T get(int position){
        if(position >= this.size || position < 0){
            throw new IndexOutOfBoundsException("Index: " + position + ", size: " + position);
        }
        return (T) this.elements[position];
    }

    public T pop(){
        Object last = this.elements[this.size - 1];
        this.elements[size - 1] = null;
        decrease();
        this.size = this.size - 1;
        return (T) last;
    }

    public int size(){
        return this.size;
    }

    @Override
    public Iterator<T> iterator() {
        return  new Iterator<T>() {
            public int pointer = 0;

            @Override
            public boolean hasNext() {
                return pointer < size;
            }

            @Override
            public T next() {
                return (T) elements[pointer++];
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder(" ");
        for(int i = 0; i < this.size; i++){
            string.append(this.elements[i]).append(" ");
        }
        return "elements = " + string;
    }
}
