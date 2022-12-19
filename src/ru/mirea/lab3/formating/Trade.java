package ru.mirea.lab3.formating;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.valueOf;

public class Trade {
    public final HashMap<String, Double> rate = new HashMap<String, Double>();

    public Trade(){
        rate.put("Dollar", 1.);
        rate.put("Euro", 1.);
        rate.put("Dinar", 0.315);
        rate.put("Rouble", 0.016);
        rate.put("Yuan", 0.142);
    }

    public void AddNewExchange(String title, double price){
        rate.put(title, price);
    }

    public Object Trading(String in, String out, double inValue){
        if (rate.containsKey(in) & rate.containsKey(out)){
            return rate.get(in) * inValue / rate.get(out);
        } else return null;
    }

    @Override
    public String toString(){
        return null;
    }
}
