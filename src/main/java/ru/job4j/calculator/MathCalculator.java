package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double divisionAndSubtraction(double first, double second) {
        return division(first, second) + subtraction(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + division(first, second)
                + subtraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат первого расчета равен: " + sumAndMultiply(30, 5));
        System.out.println("Результат второго расчета равен: " + divisionAndSubtraction(20, 10));
        System.out.println("Результат третьего расчета равен: " + sumAll(20, 10));
    }
}
