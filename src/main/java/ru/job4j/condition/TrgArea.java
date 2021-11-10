package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double four = Math.sqrt((a + b + c) / 2);
        return four;
    }

    public static void main(String[] args) {
        double four = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + four);
    }
}