package org.example;

import java.util.HashMap;

public class StudentManager {
    private static final HashMap<String, Integer> students = new HashMap<>();

    public static void addStudent(String name, int esimate) {
        if (students.containsKey(name)) {
            System.out.println("студент уже существует");
        } else {
            students.put(name, esimate);
            System.out.printf("студент %s добавлен в список\n", name);
        }
    }

    public static void removeStudent(String name) {
        if (students.containsKey(name)) {
            students.remove(name);
        } else {
            System.out.printf("студента с именем %s не существует", name);
        }
    }

    public static void getEsimate(String name) {
        if (students.containsKey(name)) {
            System.out.println(students.get(name));
        } else {
            System.out.printf("студента с именем %s не сущетсвует", name);
        }
    }

    public static void printStudents() {
        System.out.println(students);
    }

    public static void getStudent(String name) {
        if (students.containsKey(name)) {
            System.out.println("студент существует");
        } else {
            System.out.println("студента не существует");
        }
    }
}
