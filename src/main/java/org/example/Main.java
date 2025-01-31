package org.example;

public class Main {
    public static void main(String[] args) {
        Map map = new Map();
        map.showMovie();

        Filter filter = new Filter();
        filter.showNumbers();

        FlatMap flatMap = new FlatMap();
        flatMap.showWords();

        Distinct dist = new Distinct();
        dist.showNumbers();

        Sorted sorted = new Sorted();
        sorted.showWords();

        ForEach forEach = new ForEach();
        forEach.showItems();

        Collect collect = new Collect();
        collect.showCollect();

        Reduce reduce = new Reduce();
        reduce.showReduce();

        AnyMatch anyMatch = new AnyMatch();
        anyMatch.showAnyMatch();

        AllMatch allMatch = new AllMatch();
        allMatch.showAllMatch();

        Grouping grouping = new Grouping();
        grouping.showGrouping();

    }
}

