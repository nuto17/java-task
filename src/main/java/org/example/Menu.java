package org.example;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showOptions() {
        System.out.println("1 - Добавить студента");
        System.out.println("2 - Получить возраст студента");
        System.out.println("3 - Удалить студента");
        System.out.println("4 - Проверить существование студента");
        System.out.println("5 - Список всех студентов");
        System.out.println("6 - Найти id по имени");
        System.out.println("7 - Выйти");
    }

    private static int inputId() {
        System.out.println("введите id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    private static String inputName() {
        System.out.println("введите имя: ");
        String nameStud = scanner.nextLine();
        return nameStud;
    }

    private static int inputAge() {
        System.out.println("введите возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        return age;
    }

    public static void showMenu() {
        label:
        {
            while (true) {
                showOptions();
                Integer choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        StudentManager.addStudent(inputId(), inputName(), inputAge());
                        break;
                    case 2:
                        StudentManager.getAge(inputId());
                        break;
                    case 3:
                        StudentManager.removeStudent(inputId());
                        break;
                    case 4:
                        StudentManager.getStudent(inputId());
                        break;
                    case 5:
                        StudentManager.printStudents();
                        break;
                    case 6:
                        StudentManager.getId(inputName());
                        break;
                    case 7:
                        break label;
                }
            }
        }
    }
}
