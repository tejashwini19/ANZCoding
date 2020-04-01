package com.infosys.anz.entity;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class TransactionsEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String transactionId;
	private String accountNumber;
	private String accountName;
	private Date valueDate;
	private String currency;
	private Double debitAmount;
	private String transactionType;
	private Double creditAmount;
	

	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public Date getValueDate() {
		return valueDate;
	}



	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	public Double getDebitAmount() {
		return debitAmount;
	}



	public void setDebitAmount(Double debitAmount) {
		this.debitAmount = debitAmount;
	}



	public String getTransactionType() {
		return transactionType;
	}



	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}



	public Double getCreditAmount() {
		return creditAmount;
	}



	public void setCreditAmount(Double creditAmount) {
		this.creditAmount = creditAmount;
	}



	public String getTransactionNarrative() {
		return transactionNarrative;
	}



	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}



	private String transactionNarrative;
	
}
