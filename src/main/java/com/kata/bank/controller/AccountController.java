package com.kata.bank.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kata.bank.model.Operation;
import com.kata.bank.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @PostMapping("/deposit")
    public void deposit(@RequestParam int amount) {
        service.deposit(amount);
    }

    @PostMapping("/withdraw")
    public void withdraw(@RequestParam int amount) {
        service.withdraw(amount);
    }

    @GetMapping("/statement")
    public List<Operation> statement() {
        return service.getStatement();
    }

    @GetMapping("/statement/print")
    public String printStatement() {
        return service.printStatement();
    }
}
