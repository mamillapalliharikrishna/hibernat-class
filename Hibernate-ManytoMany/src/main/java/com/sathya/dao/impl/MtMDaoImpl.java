package com.sathya.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sathya.dao.MtMDao;
import com.sathya.entity.Account;
import com.sathya.entity.Customer;
import com.sathya.util.HibernateUtil;

public class MtMDaoImpl implements MtMDao {

	public void saveNewCustomerWithAccounts(Customer customer) {
		Session   session=HibernateUtil.getSessionFactory().openSession();
		Transaction  tx=session.beginTransaction();
		session.save(customer);
		tx.commit();
		session.close();
	}

	public void saveNewAccountExistingCustomer(Integer custid, Account account) {
		Session   session=HibernateUtil.getSessionFactory().openSession();
		Customer   customer=session.get(Customer.class, custid);
		List<Account>    accounts = customer.getAccounts();
		Transaction   tx = session.beginTransaction();
		accounts.add(account);
		tx.commit();
		session.close();
	}

	public void removeExistingAccountFromCustomer(Integer custid, Integer accno) {
		Session   session=HibernateUtil.getSessionFactory().openSession();
		Customer   customer=session.get(Customer.class, custid);
		List<Account>    accounts = customer.getAccounts();
		Account   account=session.get(Account.class, accno);
		Transaction   tx=session.beginTransaction();
		accounts.remove(account);
		tx.commit();
		session.close();
	}

	public void findCustomerWithAccounts(Integer custid) {
		Session   session=HibernateUtil.getSessionFactory().openSession();
		Customer   customer=session.get(Customer.class, custid);
		List<Account>    accounts = customer.getAccounts();
		System.out.println("customerid ="+customer.getCustid()+", customername="+customer.getCustname());
		System.out.println("======================");
		for(Account  account: accounts) {
			System.out.println("accno="+account.getAccno()+", acctype="+account.getAcctype()+", balance="+account.getBalance());
		}
		session.close();
	}
}
