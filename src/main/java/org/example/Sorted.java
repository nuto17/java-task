package org.example;

import java.util.List;
import java.util.stream.Collectors;

//Дан список слов, отсортируй его по алфавиту.
public class Sorted {
    List<String> words = List.of("banana", "apple", "cherry", "date");

    List<String> wordsStream = words.stream().sorted().collect(Collectors.toList());

    public void showWords(){
        System.out.println(wordsStream);
    }



}
