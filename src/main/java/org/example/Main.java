package org.example;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println(userService.findById(4).toString());

    }
}