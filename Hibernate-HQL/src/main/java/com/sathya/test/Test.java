package com.sathya.test;

import com.sathya.dao.IEmpDao;
import com.sathya.dao.impl.EmpDaoImpl;

public class Test {

	public static void main(String[] args) {
		IEmpDao  dao =new EmpDaoImpl();
		dao.findEmployeesByDeptno(20);
		System.out.println("##########################");
		dao.deleteEmployeesBySalary(62000);
		

	}

}
