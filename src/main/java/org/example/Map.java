package org.example;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    List<String> movies = List.of("  инТЕРСТЕЛЛАР ", "фОрд против ferrari ", " дЖокер  ");

    public void showMovie(){
        List<String> moviesStream  = movies.stream()
                .map(String::trim).map(x -> x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase()).collect(Collectors.toList());
        System.out.println(moviesStream.toString());
    }
}
