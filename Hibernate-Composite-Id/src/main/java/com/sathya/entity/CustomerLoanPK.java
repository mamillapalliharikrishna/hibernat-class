package com.sathya.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class CustomerLoanPK implements  Serializable {
	private  Integer  custid;
	private  String   loanid;
	public Integer getCustid() {
		return custid;
	}
	public void setCustid(Integer custid) {
		this.custid = custid;
	}
	public String getLoanid() {
		return loanid;
	}
	public void setLoanid(String loanid) {
		this.loanid = loanid;
	}
	
	
}
