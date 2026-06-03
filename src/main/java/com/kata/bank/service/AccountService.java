package com.kata.bank.service;

import java.util.List;

import com.kata.bank.model.Operation;

public interface AccountService {
    void deposit(int amount);

    void withdraw(int amount);

    List<Operation> getStatement();
}
