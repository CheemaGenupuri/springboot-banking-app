package com.springboot.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.Account;
import com.springboot.app.model.Transaction;
import com.springboot.app.service.BankingAppService;

@RestController
public class BankingAppController {
	
	@Autowired
	private BankingAppService bankingAppService;
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome cheema";
	}
//	@RequestMapping(value = "/transactions/{accountId}", method = RequestMethod.GET)
	@GetMapping("/transactions")
    public List<Transaction> getTansactions() {
        return bankingAppService.viewTransactions();
    }
	
	@GetMapping("/transactions/{accountNumber}")
	public List<Transaction> getTransactionsByAccNumber(@PathVariable String accountNumber){
		return bankingAppService.viewTransactionsByAccNumber(accountNumber);
		
	}
	
	@GetMapping("/accounts")
    public List<Account> getAccounts() {
        return bankingAppService.viewAccountList();
    }
	

}
