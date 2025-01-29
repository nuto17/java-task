package org.example;

public enum Type {
    uppercase(1, "uppercase"),
    lowercase(2, "lowercase"),
    camelcase(3, "camelcase");
    private final int value;
    private final String description;
    Type(int value, String description) {
        this.value = value;
        this.description = description;
    }
    public int getValue() {
        return value;
    }
    public String getDescription() {
        return description;
    }
}