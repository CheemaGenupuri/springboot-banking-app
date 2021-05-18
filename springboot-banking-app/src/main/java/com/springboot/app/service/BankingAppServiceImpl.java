package com.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.model.Account;
import com.springboot.app.model.Transaction;
import com.springboot.app.repository.AccountRepository;
import com.springboot.app.repository.TransactionRepository;

@Service
public class BankingAppServiceImpl implements BankingAppService {
	
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;
	
//	@Override
//    public List<Transaction> getTransactions(String accountId) {
//        Optional<List<Transaction>> transactions = transactionsStorage.getTransactions(accountId);
//        if (!transactions.isPresent()) {
//            return new ArrayList<>();
//        }
//
//        List<Transaction> transactionsList = transactions.get();
//
//        if (limit <= 0) {
//            return transactionsList;
//        }
//
//        return transactionsList.subList(Math.max(transactionsList.size() - limit, 0), transactionsList.size());
//    }
	
	public List<Transaction> viewTransactions(){
		return transactionRepository.findAll();
	}
	
	
	public List<Account> viewAccountList(){
		return (List<Account>) accountRepository.findAll();
	}



	@Override
	public List<Transaction> viewTransactionsByAccNumber(String accountNumber) {
		// TODO Auto-generated method stub
		return (List<Transaction>) transactionRepository.findByAccountNumber(accountNumber);
	}

}
