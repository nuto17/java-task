package org.example;

import java.util.List;
import java.util.Locale;

//Проверь, состоят ли все слова в списке только из строчных букв
public class AllMatch {
    List<String> words = List.of("apple", "banana", "cherry");

    public void showAllMatch(){
        boolean wordsStream = words.stream().allMatch(x->x.equals(x.toLowerCase()));
        System.out.println(wordsStream);
    }

}
