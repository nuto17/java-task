package org.example;

public class printEsimate {

    public static void showEsimate(String name) {
        for ( String student : addStudent.students.keySet()){
            if (name.equals(student)){
                System.out.println(addStudent.students.get(student));
            }
            else System.out.println("нет такого студента");
        }
    }

    public static void removeStudent(String name) {
        for ( String student : addStudent.students.keySet()){
            if (name.contains(student)){
                addStudent.students.remove(student);
            }
            else System.out.println("некого удалять");
        }
    }
}
