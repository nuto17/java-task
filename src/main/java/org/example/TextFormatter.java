package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TextFormatter {
    Camelcase camelcase = new Camelcase();
    private static final Scanner scanner = new Scanner(System.in);
    public void chooseType() {
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
        System.out.println("выбор формата: " + Arrays.toString(Type.values()));
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println(text.toUpperCase());
                break;
            case 2:
                System.out.println(text.toLowerCase());
                break;
            case 3:
                System.out.println(camelcase.toCamelCase(text));
                break;

        }

    }
}
