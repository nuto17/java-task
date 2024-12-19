package org.example;

public class Student {
    private final static int maxStudentCount = 5;
    public String name;
    public int age;
    public static int studentCount = 0;

    Student() {
        if (studentCount > maxStudentCount - 1) {
            throw new RuntimeException("текст какой-нибудь");
        } else {
            studentCount++;
        }
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        if (studentCount > maxStudentCount) {
            System.out.println("Student is over max student count");
        } else {
            studentCount++;
        }

    }
}

