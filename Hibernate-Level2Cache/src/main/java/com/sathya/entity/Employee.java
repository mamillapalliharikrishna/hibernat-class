package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="EMP")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY,  region="employee")
public class Employee {
	@Id
	@Column(name="EMPNO")
	private  Integer  empNumber;
	
	@Column(name="ENAME")
	private  String   empName;
	
	@Column(name="SAL")
	private  Integer  salary;
	
	@Column(name="DEPTNO")
	private  Integer   deptNumber;

	public Integer getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(Integer empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(Integer deptNumber) {
		this.deptNumber = deptNumber;
	}
	
	public  String   toString() {
		return  "Employee[EMPNO="+empNumber+", ENAME="+empName+", SAL="+salary+", DEPTNO="+deptNumber+"]";
	}

}





