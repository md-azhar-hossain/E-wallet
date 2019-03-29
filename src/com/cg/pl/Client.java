package com.cg.pl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.bean.Account;
import com.cg.exception.AccountException;
import com.cg.service.AccountService;
import com.cg.service.AccountServiceImpl;

public class Client {

	public static void main(String[] args) throws AccountException {
		// TODO Auto-generated method stub

		while(true) {
			System.out.println("Select your choice: \n" 
					+ "1. Show Account Details(StaticDB) \n"
					+ "2. Create Account \n"
					+ "3. Delete Account \n"
					+ "4. Deposit \n"
					+ "5. Withdraw \n"
					+ "6. Fund Transafer \n"
					+ "7. Print Transactions \n");

			AccountService service = new AccountServiceImpl();
			Scanner sc = new Scanner(System.in);
			
			int choice = sc.nextInt();

			switch(choice){

			case 1:{

				List<Account> list = new ArrayList<>(service.getDetails());

				System.out.println(list);
			}
			break;

			case 2:{
				
				int id=sc.nextInt();
				String name=sc.next();
				double balance=sc.nextDouble();
				Account ac =new Account(id,name,balance);
				List<Account> list=new ArrayList<>(service.addAccount(ac));
				System.out.println(list);
			}
			break;
			
			case 3:{
				System.out.println("Enter the Account ID you want to delete: ");
				int id = sc.nextInt();
				List<Account> list = new ArrayList<Account>(service.delAccount(id));
				System.out.println(list);
			}
			break;
			
			case 4:{
				System.out.println("Enter the account ID you want to deposit: ");
				int id = sc.nextInt();
				System.out.println("Enter the amount you wish to deposit: ");
				double amtD = sc.nextDouble();
				List<Account> list = new ArrayList<Account>(service.deposit(id,amtD));
				System.out.println("Updated balance for account ID " + id + " is: " + list);
			}
			break;
			
			}
		}
		}
		

}
