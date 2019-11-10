package com.sathya.dao;

import com.sathya.entity.Card;
import com.sathya.entity.Cheque;

public interface IPaymentDao {
	void  saveCard(Card  card);
	void  saveCheque(Cheque  cheque);
}
