package com.sathya.dao;

import com.sathya.entity.Customer;

public interface OneToManyDao {
	void   saveCustomer(Customer  customer);
	void   removeCustomer(Integer  customerid);
	void   fetchCustomer(Integer  customerid);
}
