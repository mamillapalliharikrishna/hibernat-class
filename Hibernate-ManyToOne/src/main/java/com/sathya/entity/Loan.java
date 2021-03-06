package com.sathya.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Loan {
	@Id
	private  Integer  loanid;
	@Column(length=15)
	private  String   type;
    private  Double  amount;
    @ManyToOne(cascade=CascadeType.REMOVE)
    @JoinColumn(name="CUSTOMERID_FK", referencedColumnName="CUSTOMERID")
    private   Customer   customer;
	public Integer getLoanid() {
		return loanid;
	}
	public void setLoanid(Integer loanid) {
		this.loanid = loanid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
    
    
    

}






