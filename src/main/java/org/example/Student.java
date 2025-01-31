package org.example;

public class Student {
    String name;
    String group;
    int grade;

    public Student(String name, String group, int grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " (" + group + ") - " + grade;
    }

    public String getGroup() {
        return group;
    }

    public int getGrade(){
        return grade;
    }
}
