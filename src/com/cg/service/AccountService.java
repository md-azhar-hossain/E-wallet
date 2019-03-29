package com.cg.service;

import java.util.List;

import com.cg.bean.Account;
import com.cg.exception.AccountException;

public interface AccountService {
	
	public List<Account> addAccount(Account acc);
	
	public List<Account> getDetails() throws AccountException;

	public List<Account> delAccount(int id) throws AccountException;

	public List<Account> deposit(int id, double amtD);
	
}
 