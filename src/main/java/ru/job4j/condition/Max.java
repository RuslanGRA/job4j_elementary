package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = true;
        return left >= right ? left : right;
    }

    public static void main(String[] args) {
        int fin = Max.max(1, 0);
        System.out.println(fin);
    }
}