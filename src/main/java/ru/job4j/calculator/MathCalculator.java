package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
          return sum(first, second) + myltiply(first, second);
    }

    public static double lessAndshare(double first, double second) {
        return less(first, second) + share(first, second);
    }

    public static double sumAndMultiplyAndlessAndshare(double first, double second) {
        return sumAndMultiply(first, second) + lessAndshare(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен " + lessAndshare(20, 10));
        System.out.println("Результат расчета равен " + sumAndMultiplyAndlessAndshare(230, 12));
    }
}
