package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(210);
        float expectedEuro = 3;
        boolean isPassedEuro = expectedEuro == euro;
        System.out.println("140 rubles are " + euro + " euro. Test result = " + isPassedEuro);
        float dollar = Converter.rubleToDollar(180);
        float expectedDollar = 3;
        boolean isPassedDollar = expectedDollar == dollar;
        System.out.println("140 rubles are " + dollar + " dollar. Test result = " + isPassedDollar);
    }
}