package org.example.daniel.task1;

import java.util.Scanner;

class CliHandler {
    void run() {
        runCli();
    }

    void showMenu() {
        System.out.println("1 - Сказать hello world\n0 - Выход");
    }

    String input() {
        return new Scanner(System.in).nextLine();
    }

    void runCli() {
        while (true) {
            showMenu();
            switch (input()) {
                case "1":
                    System.out.println("hello world");
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("введено некоректное значение");
            }
        }
    }
}
