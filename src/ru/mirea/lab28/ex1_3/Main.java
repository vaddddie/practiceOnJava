package ru.mirea.lab28.ex1_3;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Double, String> hashmap = new HashMap<Double, String>();
        hashmap.put(1., "Hallo");
        hashmap.put(2., "world");
        hashmap.put(3., "!");
        System.out.println(hashmap);

        Double[] keys = hashmap.keySet().toArray(new Double[0]);

        TreeMap<Double, String> treemap = new TreeMap<Double, String>();
        for (Double key : keys){
            treemap.put(key, hashmap.get(key));
        }
        System.out.println(treemap);
    }
}
