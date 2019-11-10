package com.sathya.test;

import java.util.HashSet;
import java.util.Set;

import com.sathya.dao.OneToManyDao;
import com.sathya.dao.impl.OneToManyDaoImpl;
import com.sathya.entity.Customer;
import com.sathya.entity.Loan;
import com.sathya.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		OneToManyDao  dao = new OneToManyDaoImpl();
		/*Customer  customer=new  Customer();
		customer.setCustomerid(111);
		customer.setCustomername("A");
		
		Loan  loan1=new  Loan();
		loan1.setLoanid(110011);
		loan1.setType("GOLD");
		loan1.setAmount(200000.00);
		
		Loan  loan2=new  Loan();
		loan2.setLoanid(110022);
		loan2.setType("PERSONAL");
		loan2.setAmount(300000.00);
		
		Loan  loan3=new  Loan();
		loan3.setLoanid(110033);
		loan3.setType("HOME");
		loan3.setAmount(800000.00);
		
		Set<Loan>  loans=new  HashSet<Loan>();
		loans.add(loan1);
		loans.add(loan2);
		loans.add(loan3);
		
		customer.setLoans(loans);
		
		dao.saveCustomer(customer);*/
		
	//	dao.fetchCustomer(111);
		
		dao.removeCustomer(111);
		
		
		HibernateUtil.closeSessionFactory();
		
		
		
	}

}
