package ru.job4j.calculator;

public class Converter {

    public static float rubleToEvro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEvro(140);
        float dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("120 rubles are " + dollar + " dollar");
    }
}
