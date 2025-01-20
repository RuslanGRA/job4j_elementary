package ru.job4j.calculator;

public class Fit {

    public static double idealWeight(short height, boolean isMan) {
        int base = isMan ? 100 : 110;
        return (height - base) * 1.15;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;

        System.out.printf("Ideal weight for a man with height %d cm: %.2f kg%n", heightMan, idealWeight(heightMan, true));
        System.out.printf("Ideal weight for a woman with height %d cm: %.2f kg%n", heightWoman, idealWeight(heightWoman, false));
    }
}