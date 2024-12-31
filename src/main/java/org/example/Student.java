package org.example;

public class Student {
    private  int id;
    private  String name;
    private  int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Студент{id=%d, name='%s', age=%d}", id, name, age);
    }
}
