package ru.mirea.lab20.ex4;
import java.util.Arrays;


public class MinMax<T extends Comparable<T>> {
    public T[] array;

    public MinMax(T[] array){
        this.array = array;
    }

    public T min(){
        if(array.length > 0){
            T min_value = array[0];
            for(T item : array){
                if(item.compareTo(min_value) < 0){
                    min_value = item;
                }
            }
            return min_value;
        }
        return null;
    }

    public T max(){
        if(array.length > 0){
            T max_value = array[0];
            for(T item : array){
                if(item.compareTo(max_value) > 0){
                    max_value = item;
                }
            }
            return max_value;
        }
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}