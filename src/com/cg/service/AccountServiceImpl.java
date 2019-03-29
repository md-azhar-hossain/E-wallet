package com.cg.service;

import java.util.List;

import com.cg.bean.Account;
import com.cg.dao.AccountDAO;
import com.cg.dao.AccountDAOImpl;
import com.cg.exception.AccountException;

public class AccountServiceImpl implements AccountService{

	AccountDAO dao = new AccountDAOImpl();
	
	
	public List<Account> getDetails() throws AccountException {
		// TODO Auto-generated method stub
		
		return dao.getDetails();
	}


	@Override
	public List<Account> addAccount(Account acc) {
		// TODO Auto-generated method stub
		return dao.addAccount(acc);
	}


	@Override
	public List<Account> delAccount(int id) throws AccountException {
		// TODO Auto-generated method stub
		
		return dao.delAccount(id);
	}


	@Override
	public List<Account> deposit(int id, double amtD) {
		// TODO Auto-generated method stub
		return dao.deposit(id,amtD);
	}

	
}
