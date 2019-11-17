package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sathya.entity.Customer;
import com.sathya.interceptor.CustomerInterceptor;
import com.sathya.util.HibernateUtil;

public class Test2 {
	public static void main(String[] args) {
		Session  session=HibernateUtil.getSessionFactory().withOptions().interceptor(new  CustomerInterceptor()).openSession();
		Customer   customer=session.get(Customer.class, 101);
		Transaction  tx = session.beginTransaction();
		customer.setAddress("CHENNAI");
		tx.commit();
		session.close();
		HibernateUtil.closeSessionFactory();
	}

}
