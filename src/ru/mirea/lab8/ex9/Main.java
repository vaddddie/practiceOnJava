package ru.mirea.lab8.ex9;

public class Main {
    public int combine(int a, int b){
        int coefficient = b - a;

        if (coefficient >= -1){
            if (coefficient == -1){return 1;}

            int ans = 0;
            for (int i = 1; i < a + 2; i++){
                ans += Math.pow(i, coefficient);
            }

            return ans;
        } else {return 0;}
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.combine(6, 8));
    }
}
