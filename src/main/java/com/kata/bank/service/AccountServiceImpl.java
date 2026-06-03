package com.kata.bank.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kata.bank.model.Operation;
import com.kata.bank.model.OperationType;

@Service
public class AccountServiceImpl implements AccountService {

    private int balance = 0;
    private final List<Operation> operations = new ArrayList<>();

    @Override
    public void deposit(int amount) {
        balance += amount;
        operations.add(new Operation(LocalDateTime.now(), OperationType.DEPOSIT, amount, balance));
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
        operations.add(new Operation(LocalDateTime.now(), OperationType.WITHDRAWAL, amount, balance));
    }

    @Override
    public List<Operation> getStatement() {
        return operations;
    }

    @Override
    public String printStatement() {
        StringBuilder sb = new StringBuilder();
        sb.append("DATE | OPERATION | AMOUNT | BALANCE\n");

        for (Operation op : operations) {
            sb.append(op.getDate())
                    .append(" | ")
                    .append(op.getType())
                    .append(" | ")
                    .append(op.getAmount())
                    .append(" | ")
                    .append(op.getBalanceAfterOperation())
                    .append("\n");
        }

        return sb.toString();
    }
}
