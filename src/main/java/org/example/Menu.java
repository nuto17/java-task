package org.example;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showOptions() {
        System.out.println("1 - Добавить студента");
        System.out.println("2 - Получить оценку студента");
        System.out.println("3 - Удалить студента");
        System.out.println("4 - Проверить существование студента");
        System.out.println("5 - Список всех студентов");
        System.out.println("6 - Выйти");
    }

    private static String inputName() {
        System.out.println("введите имя: ");
        String nameStud = scanner.nextLine();
        return nameStud;
    }

    private static int inputEsimate() {
        System.out.println("введите оценку: ");
        int esimate = scanner.nextInt();
        scanner.nextLine();
        return esimate;
    }

    public static void showMenu() {
        label:
        {
            while (true) {
                showOptions();
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        StudentManager.addStudent(inputName(), inputEsimate());
                        break;
                    case "2":
                        StudentManager.getEsimate(inputName());
                        break;
                    case "3":
                        StudentManager.removeStudent(inputName());
                        break;
                    case "4":
                        StudentManager.getStudent(inputName());
                        break;
                    case "5":
                        StudentManager.printStudents();
                        break;
                    case "6":
                        break label;
                }
            }
        }
    }
}
