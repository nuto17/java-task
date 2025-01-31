package org.example;
import java.util.List;
import java.util.stream.Collectors;

//У тебя есть список чисел. Оставь только чётные числа.
public class Filter {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public void showNumbers(){
        List<Integer> numbersStream = numbers.stream().filter(x -> x%2==0).collect(Collectors.toList());
        System.out.println(numbersStream);
    }
}
