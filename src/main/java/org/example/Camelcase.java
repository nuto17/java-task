package org.example;

public class Camelcase {
    public String toCamelCase(String input) {
        String[] words = input.split("[\\s_]+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                sb.append(words[i].toLowerCase());
            } else {
                sb.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }
}
