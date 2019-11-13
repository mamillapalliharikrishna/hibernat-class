package com.sathya.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
	@Id
	private   Integer  custid;
	@Column(length=12)
	private   String    custname;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="CUSTOMERACCOUNT",
	      joinColumns=@JoinColumn(name="CUSTID_FK", referencedColumnName="CUSTID"),
	     inverseJoinColumns=@JoinColumn(name="ACCNO_FK", referencedColumnName="ACCNO") )
	private   List<Account>    accounts;

	public Integer getCustid() {
		return custid;
	}

	public void setCustid(Integer custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
}





