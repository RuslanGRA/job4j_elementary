package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if (name.equals("super mario")) {
            System.out.println("start - super mario");
        }

        if (name.equals("tanks")) {
            System.out.println("start - tanks");
        }

        if (name.equals("tetris")) {
            System.out.println("start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
