package org.example;


public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.findById(4);
    }
}