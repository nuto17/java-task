package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(100);
        account.showBalance();
        account.deposit(200);
        account.showBalance();
    }
}