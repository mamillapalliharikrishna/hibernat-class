package com.sathya.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sathya.dao.ICustomerLoanDao;
import com.sathya.entity.CustomerLoan;
import com.sathya.entity.CustomerLoanPK;
import com.sathya.util.HibernateUtil;

public class CustomerLoanDaoImpl implements ICustomerLoanDao {

	@Override
	public void saveCustomerLoan(CustomerLoan cl) {
		Transaction tx=null;
		try(Session  session=HibernateUtil.getSessionFactory().openSession())
		{
			tx=session.beginTransaction();
			session.save(cl);
			tx.commit();
		}
		catch(Exception e) {
			tx.rollback();
		}

	}

	@Override
	public void findCustomerLoan(CustomerLoanPK clid) {
		try(Session  session=HibernateUtil.getSessionFactory().openSession())
		{
			CustomerLoan  cl=session.get(CustomerLoan.class, clid);
			System.out.println(cl);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
