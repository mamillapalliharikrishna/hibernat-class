package com.sathya.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sathya.dao.IPassengerDao;
import com.sathya.entity.Passenger;
import com.sathya.util.HibernateUtil;

public class PassengerDaoImpl implements IPassengerDao {

	public void save(Passenger passenger) {
		Transaction  tx=null;
		try(Session  session=HibernateUtil.getSessionFactory().openSession())
		{
			tx=session.beginTransaction();
			session.save(passenger);
			tx.commit();
		}
		catch(Exception  e) {
			tx.rollback();
		}

	}
}
