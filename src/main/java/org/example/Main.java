package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee egor = new Employee("egor", 18, 25000, "java");
        new Employee("artem", 19, 1_000_000, "chill_out");
        new Employee("arseniy", 18, 100, "java");
        new Employee("vahra", 22, 66_000, "chill_out");
        new Employee("bazay", 19, 67_000, "java");
        new Employee("sarvar", 56, 1_000_000, "chill_out");

        List<Employee> employers = egor.getEmployers();
        Stream<Employee> employersStream = employers.stream();
        employersStream.filter(x -> x.getSalary() > 65_000).map(Employee::getName).forEach(System.out::println);//вывод людей с зп> 65_000

        Map<String, Double> employersAge = employers.stream().collect(Collectors.groupingBy(Employee::getWork,Collectors.averagingInt(Employee::getAge)));
        employersAge.forEach((work, averageAge)-> System.out.println(work + ":" + averageAge + " лет"));

        employers.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().ifPresent(employeeBigSalary -> System.out.println("наибольшая зарплата у " + employeeBigSalary.getName() + "-" + " " + employeeBigSalary.getSalary()));

        List <Employee> employerInJava = employers.stream().filter(x -> x.getWork().equals("java")).filter(x-> x.getAge() <30).toList();
        for(Employee x: employerInJava){
            System.out.println(x.getName() + " "+ "меньше 30 лет");
        }
    }
}