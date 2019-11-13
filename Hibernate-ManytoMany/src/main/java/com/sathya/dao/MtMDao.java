package com.sathya.dao;

import com.sathya.entity.Account;
import com.sathya.entity.Customer;

public interface MtMDao {
	void   saveNewCustomerWithAccounts(Customer  customer);
	void   saveNewAccountExistingCustomer(Integer  custid, Account  account);
	void   removeExistingAccountFromCustomer(Integer  custid,Integer  accno);
	void   findCustomerWithAccounts(Integer  custid);
}
