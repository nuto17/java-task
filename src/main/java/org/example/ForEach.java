package org.example;

import java.util.List;
import java.util.stream.Stream;

//Выведи в консоль каждый элемент списка с префиксом "Элемент:".
public class ForEach {
    List<String> items = List.of("Книга", "Ручка", "Ноутбук", "Чашка");

    public void showItems() {
        items.stream().forEach(x -> System.out.println("элемент: " + x));
    }


}
