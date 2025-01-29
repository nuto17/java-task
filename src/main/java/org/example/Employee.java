package org.example;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    static List<Employee> employers = new ArrayList<>();
    private final String name;
    private final int age;
    private final double salary;
    private final String work;

    public Employee(String name, int age, double salary, String work) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.work = work;
        employers.add(this);
    }

    public List<Employee> getEmployers() {
        return employers;
    }

    public Object[] toArray() {
        return new Object[]{name, age, salary, work};
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
//    @Override
//    public String toString() {
//        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + ", work='" + work + "'}";
//    }
}
