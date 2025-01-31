package org.example;
import java.util.List;
//Дан список чисел. Найди их сумму с помощью reduce.

public class Reduce {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);

    public void showReduce() {
        int numbersStream = numbers.stream().reduce(0, (lat, curr) -> lat + curr);
        System.out.println(numbersStream);
    }
}
