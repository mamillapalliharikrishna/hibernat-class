package com.sathya.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sathya.util.HibernateUtil;

public class Test2 {
	public static void main(String[] args) {
		Session    session1=HibernateUtil.getSessionFactory().openSession();
		
		Session    session2=HibernateUtil.getSessionFactory().openSession();
		
		Query   query1 = session1.createQuery("from  Employee  e  where  e.deptNumber=?1");
		query1.setParameter(1, 20);
		query1.setCacheable(true);
		List  empList=query1.list();
		
		Query   query2 = session2.createQuery("from  Employee  e  where  e.deptNumber=?1");
		query2.setParameter(1, 20);
		query2.setCacheable(true);
		List  empList2=query2.list();
		
		Query   query3 = session1.createQuery("from  Employee  e  where  e.deptNumber=?1");
		query3.setParameter(1, 20);
		query3.setCacheable(true);
		List  empList3=query3.list();
		
		
		HibernateUtil.closeSessionFactory();
		
		
		
	}

}
