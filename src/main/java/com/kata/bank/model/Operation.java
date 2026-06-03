package com.kata.bank.model;

import java.time.LocalDateTime;

public class Operation {
    private LocalDateTime date;
    private OperationType type;
    private int amount;
    private int balanceAfterOperation;

    public Operation(LocalDateTime date, OperationType type, int amount, int balanceAfterOperation) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balanceAfterOperation = balanceAfterOperation;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public OperationType getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public int getBalanceAfterOperation() {
        return balanceAfterOperation;
    }

}
