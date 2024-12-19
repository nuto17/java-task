package org.example.daniel.task1;

import java.util.Scanner;

public class CliHandler {
    private final Scanner sc = new Scanner(System.in);

    private void showMenu() {
        System.out.println("1 - Сказать hello world");
        System.out.println("0 - Выход");
    }

    public void run() {
        label:
        while (true) {
            showMenu();
            switch (this.sc.nextLine()) {
                case "1":
                    System.out.println("hello world");
                    break;
                case "0":
                    break label;
                default:
                    System.out.println("введено некоректное значение");
            }
        }
    }
}