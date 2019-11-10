package com.sathya.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sathya.dao.OneToOneDao;
import com.sathya.entity.Customer;
import com.sathya.util.HibernateUtil;

public class OneToOneDaoImpl  implements  OneToOneDao {
	public void saveCustomerWithLocker(Customer customer) {
		Session   session=HibernateUtil.getSessionFactory().openSession();
		Transaction  tx=session.beginTransaction();
		session.save(customer);
		tx.commit();
		session.close();
	}
	
	public void removeCustomerById(Integer customerid) {
		Session   session=HibernateUtil.getSessionFactory().openSession();
		Customer  customer=session.get(Customer.class, customerid);
		Transaction  tx= session.beginTransaction();
		session.delete(customer);
		tx.commit();
		session.close();
	}
	
	public void findCustomerById(Integer customerid) {
		Session   session=HibernateUtil.getSessionFactory().openSession();
		Customer  customer=session.get(Customer.class, customerid);
		System.out.println(customer);
		
		session.close();
	}

}
