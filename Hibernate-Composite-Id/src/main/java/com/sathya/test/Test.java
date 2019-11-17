package com.sathya.test;

import com.sathya.dao.ICustomerLoanDao;
import com.sathya.dao.impl.CustomerLoanDaoImpl;
import com.sathya.entity.CustomerLoan;
import com.sathya.entity.CustomerLoanPK;

public class Test {
	public static void main(String[] args) {
		ICustomerLoanDao  dao=new  CustomerLoanDaoImpl();
		CustomerLoanPK   clid=new  CustomerLoanPK();
		clid.setCustid(101);
		clid.setLoanid("L902");
		 
		/*CustomerLoan  cl= new  CustomerLoan();
		cl.setClid(clid);
		cl.setEligibleamount(500000.0);
		cl.setAvailedamount(300000.0);
		cl.setTenure(10);
		dao.saveCustomerLoan(cl);*/
		
		System.out.println("#############################");
		
		dao.findCustomerLoan(clid);
		
	}

}
