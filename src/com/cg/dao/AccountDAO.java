package com.cg.dao;

import java.util.List;

import com.cg.bean.Account;
import com.cg.exception.AccountException;

public interface AccountDAO {
	
	public List<Account> addAccount(Account acc);
	
	public List<Account> getDetails() throws AccountException;

	public List<Account> delAccount(int id);
	
	public List<Account> deposit(int id, double amtD);
}
