package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    public static double distance(double x1, double x2, double y1, double y2) {
        double rsl = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = distance(3, 0, 4, 0);
        System.out.println("result (3, 4) (0, 0) is " + result);
    }
}
