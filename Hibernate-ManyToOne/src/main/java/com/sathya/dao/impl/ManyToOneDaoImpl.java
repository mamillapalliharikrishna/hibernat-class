package com.sathya.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sathya.dao.ManyToOneDao;
import com.sathya.entity.Loan;
import com.sathya.util.HibernateUtil;

public class ManyToOneDaoImpl   implements ManyToOneDao {
	public  void   saveLoan(Loan  loan) {
		Session   session=HibernateUtil.getSessionFactory().openSession();
		Transaction  tx=session.beginTransaction();
		session.save(loan);
		tx.commit();
		session.close();
	}
	
	public void removeLoanById(Integer loanid) {
		Session   session=HibernateUtil.getSessionFactory().openSession();
		Transaction  tx=session.beginTransaction();
		Loan   loan = session.get(Loan.class, loanid);
		session.delete(loan);
		tx.commit();
		session.close();
		
	}
	
	public void fetchLoanById(Integer loanid) {
		Session   session=HibernateUtil.getSessionFactory().openSession();
		Transaction  tx=session.beginTransaction();
		Loan   loan = session.get(Loan.class, loanid);
		System.out.println(loan);
		tx.commit();
		session.close();
		
	}

}
