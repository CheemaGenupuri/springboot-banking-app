package com.springboot.app.service;

import java.util.List;
import java.util.Optional;

import com.springboot.app.model.Account;
import com.springboot.app.model.Transaction;

public interface BankingAppService {
	
	List<Account> viewAccountList();
	
	
	List<Transaction> viewTransactions();


	List<Transaction> viewTransactionsByAccNumber(String accountNumber);
	
	//List<Transaction> viewTransactionsByAccNumber(Long accountNumber);

}
