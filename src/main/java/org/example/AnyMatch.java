package org.example;

import java.util.List;

//Проверь, есть ли в списке строк хотя бы одно слово длиной больше 5 символов.
public class AnyMatch {
    List<String> words = List.of("apple", "banana", "car", "dog");

    public void showAnyMatch(){
        boolean wordsStream = words.stream().anyMatch(x->x.length()>5);
        System.out.println(wordsStream);
    }


}
