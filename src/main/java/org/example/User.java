package org.example;

public class User {
    private final int age;
    private final String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void showUser() {
        System.out.printf("имя: %s \nвозраст: %d%n", name, age);
    }
}
