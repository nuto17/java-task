package org.example;

import java.util.HashMap;

public class StudentManager {
    private static final HashMap<Integer, Student> students = new HashMap<>();

    public static void addStudent(int id, String name, int age) {
        if (students.containsKey(id)) {
            System.out.println("студент уже существует");
        } else {
            Student student = new Student(id, name, age);
            students.put(id, student);
            System.out.printf("студент %s добавлен в список\n", name);
        }
    }

    public static void removeStudent(int id) {
        if (students.containsKey(id)) {
            students.remove(id);
        } else {
            System.out.printf("студента с id %d не существует", id);
        }
    }

    public static void getId(String name) {
        boolean found = false;
        for (Student student : students.values()) {
            if (student.getName().equals(name)) {
                System.out.println(student.getId());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("студента не существует");
        }
    }

    public static void printStudents() {
        System.out.println(students);
    }

    public static void getAge(int id) {
        if (students.containsKey(id)) {
            System.out.println(students.get(id).getAge());
        } else {
            System.out.println("студента нет");
        }

    }

    public static void getStudent(int id) {
        if (students.containsKey(id)) {
            System.out.println("студент существует");
        } else {
            System.out.println("студента не существует");
        }
    }
}
