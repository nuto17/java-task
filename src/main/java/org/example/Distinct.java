package org.example;

import java.util.List;
import java.util.stream.Collectors;

//Дан список чисел, некоторые из них повторяются. Оставь только уникальные значения.
public class Distinct {
    List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5, 6, 6, 7);

    List<Integer> numbersStream = numbers.stream().distinct().collect(Collectors.toList());

    public void showNumbers(){
        System.out.println(numbersStream);
    }
}
