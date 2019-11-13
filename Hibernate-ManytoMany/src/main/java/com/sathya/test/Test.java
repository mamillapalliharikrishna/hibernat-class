package com.sathya.test;

import java.util.ArrayList;
import java.util.List;

import com.sathya.dao.MtMDao;
import com.sathya.dao.impl.MtMDaoImpl;
import com.sathya.entity.Account;
import com.sathya.entity.Customer;
import com.sathya.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		MtMDao   dao=new  MtMDaoImpl();
		/*Customer   customer=new Customer();
		customer.setCustid(2220222);
		customer.setCustname("B");
		
		Account  account1=new  Account();
		account1.setAccno(91122011);   account1.setAcctype("Fixed"); account1.setBalance(200000.00);
		
		Account  account2=new  Account();
		account2.setAccno(55077345);   account2.setAcctype("Savings"); account2.setBalance(700000.00);
		
		List<Account>   accounts=new  ArrayList<Account>();
		accounts.add(account1);
		accounts.add(account2);
		
		customer.setAccounts(accounts);
		
		dao.saveNewCustomerWithAccounts(customer);*/
		
		/*Account   newaccount=new   Account();
		newaccount.setAccno(66449920);
		newaccount.setAcctype("Current");
		newaccount.setBalance(250000.00);
		dao.saveNewAccountExistingCustomer(1110111, newaccount);*/
		
		//dao.removeExistingAccountFromCustomer(2220222, 91122011);
		
		dao.findCustomerWithAccounts(1110111);

		
			
		HibernateUtil.closeSessionFactory();
		

	}

}
