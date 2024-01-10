package ru.job4j.condition;

import static java.lang.Math.sqrt;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static void main(String[] args) {
        double result = area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
