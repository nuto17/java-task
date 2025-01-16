package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TextFormatter {
    private static final Scanner scanner = new Scanner(System.in);
    public void chooseType() {
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
        System.out.println("выбор формата: " + Arrays.toString(Type.values()));
        String choice = scanner.nextLine();
        switch (choice) {
            case "uppercase":
                System.out.println(text.toUpperCase());
                break;
            case "lowercase":
                System.out.println(text.toLowerCase());
                break;
            case "camelcase":
                System.out.println(text.toUpperCase());
                break;
            case "reverse":
                System.out.println(text.toUpperCase());
                break;
        }

    }
}
