package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int x2, int y1, int y2) {
        double a1 = (x2 - x1);
        double a2 = (y2 - y1);
        double pow1 = Math.pow(a1, 2);
        double pow2 = Math.pow(a2, 2);
        double first = pow1 + pow2;
        double rsl = Math.pow(first, 2);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(2, 3, 1, 3);
        double result3 = Point.distance(5, 6, 7, 2);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (2, 3) to (1, 3) " + result2);
        System.out.println("result (2, 3) to (1, 3) " + result3);
        }
    }

