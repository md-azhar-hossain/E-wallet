package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.bean.Account;
import com.cg.exception.AccountException;
import com.cg.staticDB.StaticDB;

public class AccountDAOImpl implements AccountDAO{

	
	
	@Override
	public List<Account> getDetails() throws AccountException {
		// TODO Auto-generated method stub
		HashMap<Integer, Account> map = new HashMap<>(StaticDB.getDetails());
		List<Account> list = new ArrayList<>(map.values());
		return list;
	}

	@Override
	public List<Account> addAccount(Account acc) {
		// TODO Auto-generated method stub
		HashMap<Integer, Account> map = new HashMap<>(StaticDB.getDetails());
		map.put(acc.getCustId(),acc);
		List<Account> list = new ArrayList<>(map.values());
		return list;
	}

	@Override
	public List<Account> delAccount(int id) {
		// TODO Auto-generated method stub
		HashMap<Integer, Account> map = new HashMap<>(StaticDB.getDetails());
		Integer id1=id;
		/*
		if(map.containsValue(map.get(id1).getCustId())) {
			map.remove(id1);
		}
		*/
		
		if(map.containsKey(id1)) {
			map.remove(id1);
		}
		List<Account> list = new ArrayList<>(map.values());
		return list;
	}

	@Override
	public List<Account> deposit(int id, double amtD) {
		// TODO Auto-generated method stub
		HashMap<Integer, Account> map = new HashMap<>(StaticDB.getDetails());
		Integer id2 = id;
		if(map.containsKey(id2)) {
			double amt = map.get(id2).getBalance();
			double amtD1 = map.get(id2).setBalance(amt + amtD);	
		}
		List<Account> list = new ArrayList<>(map.values());
		return list;
	}

}
