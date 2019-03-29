package com.cg.staticDB;

import java.util.HashMap;

import com.cg.bean.Account;

public class StaticDB {

	static HashMap<Integer, Account> map = new HashMap<>();

	static {
		map.put(101, new Account(101,"Yaseen",30000));
		map.put(102, new Account(102,"Manoj",50000));
		map.put(103, new Account(103,"Harsha",80000));
		map.put(104, new Account(104,"Mastan",40000));
	}

	public static HashMap<Integer, Account> getDetails() {
		return map;
	}
}
