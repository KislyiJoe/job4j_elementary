package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        System.out.println("Результат 1 равен: " + calc(1, 1, 1, 1));
        System.out.println("Результат 2 равен: " + calc(0, 1, 1, 1));
        System.out.println("Результат 3 равен: " + calc(1, 1, 0, 1));
        System.out.println("Результат 4 равен: " + calc(1, 1, 1, 0));
    }
}
