package com.kata.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.kata.bank.service.AccountService;
import com.kata.bank.service.AccountServiceImpl;

@SpringBootTest
class BankAccountKataApplicationTests {

	@Test
	void testDepositAndWithdraw() {
		AccountService service = new AccountServiceImpl();

		service.deposit(100);
		service.withdraw(40);

		assertEquals(3, service.getStatement().size());
		assertEquals(60, service.getStatement().get(1).getBalanceAfterOperation());
	}
}
