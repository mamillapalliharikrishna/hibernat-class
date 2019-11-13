package com.sathya.test;

import org.hibernate.Session;

import com.sathya.entity.Employee;
import com.sathya.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session    session1=HibernateUtil.getSessionFactory().openSession();
		
		Session    session2=HibernateUtil.getSessionFactory().openSession();
		
		Employee  e1 = session1.get(Employee.class, 7979);
		
		Employee  e2 =session1.get(Employee.class, 7979);
		
		Employee  e3 = session2.get(Employee.class, 7979);
		
		try {
			Thread.sleep(6000);
		}catch(Exception  e) { }
		
		session1.clear();
		
		Employee  e4 = session1.get(Employee.class, 7979);
		
		session1.clear();
		
		Employee  e5 = session1.get(Employee.class, 7979);
		
		try {
			Thread.sleep(6000);
		}catch(Exception  e) { }
		
		Session    session3=HibernateUtil.getSessionFactory().openSession();
		
		Employee  e6 = session3.get(Employee.class, 7979);
		
		Employee  e7 = session1.get(Employee.class, 7676);
		
		HibernateUtil.closeSessionFactory();

	}

}
