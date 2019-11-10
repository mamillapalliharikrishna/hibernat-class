package com.sathya.test;

import com.sathya.dao.OneToOneDao;
import com.sathya.dao.impl.OneToOneDaoImpl;
import com.sathya.entity.Customer;
import com.sathya.entity.Locker;

public class Test {

	public static void main(String[] args) {
		OneToOneDao   dao=new  OneToOneDaoImpl();
		
		/*Locker   locker=new  Locker();
		locker.setLockerid(111);
		locker.setLockertype("Small");
		locker.setRent(1000.00);
		
		Customer  customer=new  Customer();
		customer.setCustomerid(101);
		customer.setCustomername("A");
		customer.setLocker(locker);
		dao.saveCustomerWithLocker(customer);*/
		
		//dao.findCustomerById(101);
		
		dao.removeCustomerById(101);
		

	}

}
