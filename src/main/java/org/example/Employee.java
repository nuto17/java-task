package org.example;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final String name;
    private final int age;
    private final double salary;
    private final String work;

    public Employee(String name, int age, double salary, String work) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.work = work;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getWork() {
        return work;

    }
}
