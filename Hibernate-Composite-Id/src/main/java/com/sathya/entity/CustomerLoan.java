package com.sathya.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class CustomerLoan {
	@EmbeddedId
	private  CustomerLoanPK   clid;
	private  Double  eligibleamount;
	private  Double  availedamount;
	private  Integer  tenure;
	public CustomerLoanPK getClid() {
		return clid;
	}
	public void setClid(CustomerLoanPK clid) {
		this.clid = clid;
	}
	public Double getEligibleamount() {
		return eligibleamount;
	}
	public void setEligibleamount(Double eligibleamount) {
		this.eligibleamount = eligibleamount;
	}
	public Double getAvailedamount() {
		return availedamount;
	}
	public void setAvailedamount(Double availedamount) {
		this.availedamount = availedamount;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	
	public  String   toString() {
		return "CustomerLoan[custid="+clid.getCustid()+", loanid="+clid.getLoanid()+", eligibleamount="+eligibleamount+", availedamount="+availedamount+", tenure="+tenure+"]";
	}

}





