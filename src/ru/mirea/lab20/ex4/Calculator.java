package ru.mirea.lab20.ex4;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T first_value, V second_value) {

        return first_value.doubleValue() + second_value.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T first_value, V second_value) {
        return first_value.doubleValue() * second_value.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T first_value, V second_value) {
        return first_value.doubleValue() / second_value.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T first_value, V second_value) {
        return first_value.doubleValue() - second_value.doubleValue();
    }
}
