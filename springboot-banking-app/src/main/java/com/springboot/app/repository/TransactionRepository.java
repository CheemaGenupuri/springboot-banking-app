package com.springboot.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springboot.app.model.Transaction;


public interface TransactionRepository extends JpaRepository<Transaction, Long>{
	
	 
	List<Transaction> findAll();


	List<Transaction> findByAccountNumber(String accountNumber);

	


}
