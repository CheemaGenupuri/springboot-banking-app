package com.springboot.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springboot.app.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
	List<Account> findAll();

	

}
