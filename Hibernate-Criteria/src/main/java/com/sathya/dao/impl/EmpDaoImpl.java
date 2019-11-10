package com.sathya.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.sathya.dao.IEmpDao;
import com.sathya.entity.Employee;
import com.sathya.util.HibernateUtil;

public class EmpDaoImpl implements IEmpDao {

	public void findAllEmployees() {
		Session  session=HibernateUtil.getSessionFactory().openSession();
		Criteria  crit = session.createCriteria(Employee.class);
		crit.addOrder(Order.asc("empName"));
		List<Employee>  empList = crit.list();
		for(Employee  e : empList) {
			System.out.println(e);
		}
		session.close();

	}

	public void findByDeptno(Integer deptNumber) {
		Session  session=HibernateUtil.getSessionFactory().openSession();
		Criteria  crit = session.createCriteria(Employee.class);
		Projection  p1 = Projections.property("empName");
		Projection  p2 = Projections.property("salary");
		Criterion  c1 = Restrictions.eq("deptNumber", deptNumber);
		ProjectionList  plist = Projections.projectionList();
		plist.add(p1);
		plist.add(p2);
		
		crit.setProjection(plist);
		crit.add(c1);
		
		List<Object[]>  list = crit.list();
		for(Object[ ]   obj : list) {
			System.out.println(obj[0]+" , "+obj[1]);
		}
		session.close();
	}

}







