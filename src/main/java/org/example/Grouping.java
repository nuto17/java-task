package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Твое задание:
//Сгруппируй студентов по группам (group).
//Сгруппируй студентов по оценкам: "Отличник" (>=90), "Хорошист" (80-89), "Троечник" (<80).
//Выведи, сколько студентов в каждой категории.
public class Grouping {
    List<Student> students = List.of(
            new Student("Алексей", "Группа A", 85),
            new Student("Ирина", "Группа B", 90),
            new Student("Сергей", "Группа A", 78),
            new Student("Мария", "Группа B", 92),
            new Student("Владимир", "Группа C", 70),
            new Student("Ольга", "Группа A", 88)
    );

    public void showGrouping() {
        Map studentsByGroup = students.stream()
                .collect(Collectors.groupingBy(Student::getGroup));
        System.out.println(studentsByGroup);

        Map studentsGroup = students.stream().collect(Collectors.groupingBy(student -> {
            if (student.getGrade() >= 90) {
                return "Отличник";
            } else if (student.getGrade() >= 80) {
                return "Хорошист";
            } else {
                return "Троечник";
            }
        }, Collectors.counting()));
        System.out.println(studentsGroup);


    }

}
