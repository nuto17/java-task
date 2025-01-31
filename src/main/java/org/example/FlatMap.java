package org.example;
import java.util.List;
import java.util.stream.Collectors;

//Дан список предложений, каждое из которых — это строка с несколькими словами. Нужно разбить предложения на отдельные слова и собрать их в один список.
public class FlatMap {
    List<String> sentences = List.of("Java Stream API", "FlatMap is useful", "Practice makes perfect");
    List<String> words = sentences.stream().flatMap(x -> List.of(x.split(" ")).stream()).collect(Collectors.toList());

    public void showWords(){
        System.out.println(words);
    }

}

