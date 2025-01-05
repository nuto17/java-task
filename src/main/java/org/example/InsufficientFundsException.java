package org.example;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(double amount) {
        super("сумма" + amount + "больше, чем актуальный баланс");
    }
}
