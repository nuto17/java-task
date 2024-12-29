package org.example;

import java.util.Scanner;

public class menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showMenu1() {
        System.out.println("1 - Добавить студента");
        System.out.println("2 - Получить оценку студента");
        System.out.println("3 - Удалить студента");
        System.out.println("4 - проверить существование студента");
        System.out.println("5 - список всех студентов");
        System.out.println("6 - Выйти");
    }

    private static String inputName(){
        System.out.println("введите имя: ");
        String nameStud = scanner.nextLine();
        return nameStud;
    }

    private static int inputEsimate(){
        System.out.println("введите оценку: ");
       int esimate = scanner.nextInt();
       scanner.nextLine();
       return esimate;
    }

    public static void showMenu(){
        label:{
        while(true){
            showMenu1();
            String choice = scanner.nextLine();
            switch(choice){
                case "1":
                    addStudent.addStud(inputName(),inputEsimate());
                    break;
                    case "2":
                        printEsimate.showEsimate(inputName());
                        break;
                        case "3":
                            printEsimate.removeStudent(inputName());
                            break;
                            case "4":
                                existenceStudent.existence(inputName());
                                break;
                            case "5":
                                addStudent.printStudents();
                                break;
                                case "6":
                                    break label;
                }
            }
        }
    }
}
