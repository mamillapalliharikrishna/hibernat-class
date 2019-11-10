package com.sathya.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sathya.dao.OneToManyDao;
import com.sathya.entity.Customer;
import com.sathya.util.HibernateUtil;

public class OneToManyDaoImpl   implements  OneToManyDao {
	
	public void saveCustomer(Customer customer) {
		Session   session=HibernateUtil.getSessionFactory().openSession();
		Transaction  tx=session.beginTransaction();
		session.save(customer);
		tx.commit();
		session.close();
	}
	
	public void removeCustomer(Integer customerid) {
		Session   session=HibernateUtil.getSessionFactory().openSession();
		Transaction  tx=session.beginTransaction();
		Customer  customer=session.get(Customer.class, customerid);
		session.delete(customer);
		tx.commit();
		session.close();
		
	}
	
	public void fetchCustomer(Integer customerid) {
		Session   session=HibernateUtil.getSessionFactory().openSession();
		
		Customer  customer=session.get(Customer.class, customerid);
		System.out.println("customerid ="+customer.getCustomerid());
		System.out.println("customername="+customer.getCustomername());
		System.out.println("No of loans : "+customer.getLoans().size());
		
		session.close();
		
	}
	

}
