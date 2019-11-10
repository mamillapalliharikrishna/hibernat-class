package com.sathya.test;

import java.time.LocalDate;

import com.sathya.dao.IPaymentDao;
import com.sathya.dao.PaymentDaoImpl;
import com.sathya.entity.Card;
import com.sathya.entity.Cheque;
import com.sathya.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		IPaymentDao  dao=new  PaymentDaoImpl();
		Card  card=new  Card();
		card.setTxid(103L);
		card.setAmount(2000.0);
		card.setTxdate(LocalDate.now());
		card.setCardno(6780192L);
		card.setCardtype("MASTER");
		dao.saveCard(card);
		
		Cheque  cheque=new  Cheque();
		cheque.setTxid(104L);
		cheque.setAmount(9000.0);
		cheque.setTxdate(LocalDate.of(2019,10,23));
		cheque.setChequeno(890135L);
		cheque.setChequetype("ORDER");
		dao.saveCheque(cheque);
	
		HibernateUtil.closeSessionFactory();

	}

}
