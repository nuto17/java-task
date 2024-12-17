package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runCli();
    }

    static String input() {
        return new Scanner(System.in).nextLine();
    }

    static void showMenu() {
        System.out.println("1 - Сказать hello world\n0 - Выход");
    }

    static void runCli() {
        while (true) {
            showMenu();
            switch (input()) {
                case "1":
                    System.out.println("Сказать hello world");
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("неверное вариант");
            }
        }
    }
}