package org.example;


public class Account {
    private double balance;

    public Account() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("сумма не должжна быть меньше 0");
        }
        this.balance += amount;
        System.out.println("сумма " + amount + " добавлена на баланс");
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            throw new InsufficientFundsException(amount);
        }
        this.balance -= amount;
        System.out.println("сумма "+amount + " снята с баланса");
    }

    public void showBalance(){
        System.out.println("ваш баланс: " + this.balance);
    }
}
