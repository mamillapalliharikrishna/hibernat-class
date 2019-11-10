package com.sathya.dao;

public interface IEmpDao {
	void  findEmployeesByDeptno(Integer  deptNumber);
	void  deleteEmployeesBySalary(Integer salary);

}
