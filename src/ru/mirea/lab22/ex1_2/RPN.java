package ru.mirea.lab22.ex1_2;

import java.util.Stack;

public class RPN {
    public static String Do(String _str){
        Stack<Double> stack = new Stack<>();
        String[] str = _str.split(" ");

        for (String item : str){
            if (isNumeric(item)) {
                stack.push(Double.parseDouble(item));
            } else if (item.equals("+") | item.equals("-") | item.equals("*") | item.equals("/")){
                double x;
                double y;

                if (!stack.isEmpty()){
                    y = stack.pop();
                } else {
                    return "Not valid string!";
                }
                if (!stack.isEmpty()){
                    x = stack.pop();
                } else {
                    return "Not valid string!";
                }

                if (item.equals("+")){
                    stack.push(sum(x, y));
                }
                if (item.equals("-")){
                    stack.push(subtraction(x, y));
                }
                if (item.equals("*")){
                    stack.push(multiply(x, y));
                }
                if (item.equals("/")){
                    if (y != 0.){
                        stack.push(divide(x, y));
                    } else {
                        return "Division by zero!";
                    }
                }
            }
        }

        if (!stack.isEmpty()){
            return stack.pop().toString();
        } else {
            return "Numbers or operations not found";
        }
    }

    private static double sum(double x, double y){
        return x + y;
    }

    private static double subtraction(double x, double y){
        return x - y;
    }

    private static double multiply(double x, double y){
        return x * y;
    }

    private static double divide(double x, double y){
        return x / y;
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
