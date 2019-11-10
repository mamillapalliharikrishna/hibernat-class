package com.sathya.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sathya.entity.Card;
import com.sathya.entity.Cheque;
import com.sathya.util.HibernateUtil;

public class PaymentDaoImpl implements IPaymentDao {

	
	public void saveCard(Card card) {
		Transaction tx=null;
		Session  session=HibernateUtil.getSessionFactory().openSession();
		try
		{
			tx = session.beginTransaction();
			session.save(card);
			tx.commit();
		}
		catch(Exception  e) {
			tx.rollback();
		}
		

	}

	
	public void saveCheque(Cheque cheque) {
		Transaction  tx=null;
		Session   session=HibernateUtil.getSessionFactory().openSession();
		try
		{
			tx = session.beginTransaction();
			session.save(cheque);
			tx.commit();
		}catch(Exception  e)
		{
			tx.rollback();
		}
		

	}

}
