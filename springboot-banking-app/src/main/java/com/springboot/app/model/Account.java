package com.springboot.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AccountNumber")
	private Long AccountNumber;
	
	@Column(name="AccountName")
	private String AccountName;
	
	@Column(name="AccountType")
	 private String AccountType ; 
	
	@Column(name="BalanceDate")
	 private Date BalanceDate;
	
	public Long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public Date getBalanceDate() {
		return BalanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		BalanceDate = balanceDate;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public float getOpeningAvailableBalance() {
		return OpeningAvailableBalance;
	}

	public void setOpeningAvailableBalance(float openingAvailableBalance) {
		OpeningAvailableBalance = openingAvailableBalance;
	}

	@Column(name="Currency")
	 private String Currency;
	
	@Column(name="OpeningAvailableBalance")
	 private float OpeningAvailableBalance;
	
	

}
