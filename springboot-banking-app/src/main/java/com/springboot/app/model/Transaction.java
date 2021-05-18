package com.springboot.app.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transactionNumber")
	private Long TransactionNumber ;
	
	@Column(name = "accountNumber")
	private String accountNumber; 

	@Column(name = "accountName")
	private String AccountName ;
	
	@Column(name = "debitAmount")
	private float DebitAmount ;
	
	@Column(name = "creditAmount")
	private float CreditAmount ; 
	
	@Column(name = "debit_Credit")
	private String Debit_Credit;
	
	@Column(name = "valueDate")
	private Date ValueDate ;
	
	@Column(name = "currency")
	private String Currency ; 
	
	@Column(name = "trascationNarrative")
	private String TrascationNarrative;

	public Long getTransactionNumber() {
		return TransactionNumber;
	}

	public void setTransactionNumber(Long transactionNumber) {
		TransactionNumber = transactionNumber;
	}


	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	public float getDebitAmount() {
		return DebitAmount;
	}

	public void setDebitAmount(float debitAmount) {
		DebitAmount = debitAmount;
	}

	public float getCreditAmount() {
		return CreditAmount;
	}

	public void setCreditAmount(float creditAmount) {
		CreditAmount = creditAmount;
	}

	public String getDebit_Credit() {
		return Debit_Credit;
	}

	public void setDebit_Credit(String debit_Credit) {
		Debit_Credit = debit_Credit;
	}

	public Date getValueDate() {
		return ValueDate;
	}

	public void setValueDate(Date valueDate) {
		ValueDate = valueDate;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public String getTrascationNarrative() {
		return TrascationNarrative;
	}

	public void setTrascationNarrative(String trascationNarrative) {
		TrascationNarrative = trascationNarrative;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	


}
