package com.sathya.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sathya.dao.IEmpDao;
import com.sathya.entity.Employee;
import com.sathya.util.HibernateUtil;

public class EmpDaoImpl implements IEmpDao {
    
	public void findEmployeesByDeptno(Integer deptNumber) {
		Session  session=HibernateUtil.getSessionFactory().openSession();
		Query  query=session.createQuery(ApplicationQueries.SELECT_QUERY);
		query.setParameter(1, deptNumber);
		List<Employee>  empList = query.list();
		for(Employee   emp:empList) {
			System.out.println(emp);
		}
		
		session.close();

	}

	public void deleteEmployeesBySalary(Integer salary) {
		Session  session=HibernateUtil.getSessionFactory().openSession();
		Query  query=session.createQuery(ApplicationQueries.DELETE_QUERY);
		query.setParameter("salary", salary);
		Transaction  tx=session.beginTransaction();
		int  count=query.executeUpdate();
		tx.commit();
		System.out.println("count = "+count);
		session.close();

	}
}
