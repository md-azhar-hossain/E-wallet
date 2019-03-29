package com.cg.bean;

import java.util.List;

public class Account {
	private int custId;
	private String custName;
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int custId, String custName, double balance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.balance = balance;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getBalance() {
		return balance;
	}

	public double setBalance(double balance) {
		return this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [custId=" + custId + ", custName=" + custName + ", balance=" + balance + "]";
	}
	
	
}
