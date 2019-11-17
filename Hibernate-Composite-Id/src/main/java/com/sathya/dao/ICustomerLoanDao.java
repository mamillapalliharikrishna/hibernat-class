package com.sathya.dao;

import com.sathya.entity.CustomerLoan;
import com.sathya.entity.CustomerLoanPK;

public interface ICustomerLoanDao {
	void  saveCustomerLoan(CustomerLoan  cl);
	void  findCustomerLoan(CustomerLoanPK  clid);
}
