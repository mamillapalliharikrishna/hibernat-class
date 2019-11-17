package com.sathya.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sathya.entity.Customer;
import com.sathya.interceptor.CustomerInterceptor;
import com.sathya.util.HibernateUtil;

public class Test1 {
	public static void main(String[] args) {
		Session  session=HibernateUtil.getSessionFactory().withOptions().interceptor(new  CustomerInterceptor()).openSession();
		
		Customer   customer=new  Customer();
		customer.setId(101);
		customer.setName("Rajesh");
		customer.setAddress("Hyd");
		
		Transaction  tx = session.beginTransaction();
		session.save(customer);
		tx.commit();
		session.close();
		HibernateUtil.closeSessionFactory();
		
	}

}
