package org.example;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Дан список чисел. Преобразуй его в Set (чтобы убрать дубликаты)
public class Collect {
    List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
    Set<Integer> numbersStream = numbers.stream().collect(Collectors.toSet());

    public void showCollect(){
        System.out.println(numbersStream);
    }
}
