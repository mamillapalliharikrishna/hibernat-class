package com.sathya.dao;

import com.sathya.entity.Customer;

public interface OneToOneDao {
	 void  saveCustomerWithLocker(Customer  customer);
	 void  removeCustomerById(Integer  customerid);
	 void  findCustomerById(Integer  customerid);
	 

}
