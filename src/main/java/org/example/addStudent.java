package org.example;

import java.util.HashMap;

public class addStudent {
    public static final HashMap <String,Integer> students = new HashMap<>();

    public static void addStud(String name,int estimate) {
        if (students.containsKey(name)) {
            System.out.println("Студент с таким именем уже существует");
        } else {students.put(name, estimate);
                System.out.println("студент добавлен");
        }
    }

    public String removeStudent(String name){
        if (students.containsKey(name)){
            students.remove(name);
            return "Student removed";}
        else return "Student not found";
    }

    public static void printStudents(){
        System.out.println(students);
    }

}
