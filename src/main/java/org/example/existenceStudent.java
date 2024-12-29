package org.example;

public class existenceStudent {
    public static void existence(String name){
        if (addStudent.students.containsKey(name)){
            System.out.printf("студент %s уже существует\t",name);
        }
        else{
            System.out.printf("Студента с именем $s не существует\t",name);
        }
    }
}
