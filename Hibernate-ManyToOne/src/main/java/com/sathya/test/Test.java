package com.sathya.test;

import com.sathya.dao.ManyToOneDao;
import com.sathya.dao.impl.ManyToOneDaoImpl;
import com.sathya.entity.Customer;
import com.sathya.entity.Loan;
import com.sathya.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		ManyToOneDao  dao =new  ManyToOneDaoImpl();
		
		Customer  customer=new Customer();
		customer.setCustomerid(101);
		customer.setCustomername("A");
		
		/*Loan   loan1=new  Loan();
		loan1.setLoanid(11011);
		loan1.setType("PERSONAL");
		loan1.setAmount(500000.00);
		loan1.setCustomer(customer);*/
		
		
	/*	Loan   loan2=new  Loan();
		loan2.setLoanid(11022);
		loan2.setType("HOME");
		loan2.setAmount(1500000.00);
		loan2.setCustomer(customer);
		
		Loan   loan3=new  Loan();
		loan3.setLoanid(11033);
		loan3.setType("VEHICLE");
		loan3.setAmount(800000.00);
		loan3.setCustomer(customer);
		
				
		dao.saveLoan(loan2);
		dao.saveLoan(loan3);*/
		
		dao.removeLoanById(11011);
		
		
		HibernateUtil.closeSessionFactory();
		
		
		
		
	}

}
