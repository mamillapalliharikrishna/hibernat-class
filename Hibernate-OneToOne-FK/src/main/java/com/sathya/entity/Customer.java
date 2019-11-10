package com.sathya.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_TAB")
public class Customer {
	@Id
	private   Integer  customerid;
	@Column(length=15)
	private   String   customername;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="LOCKERID_FK", referencedColumnName="LOCKERID", unique=true )
	private   Locker   locker;

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Locker getLocker() {
		return locker;
	}

	public void setLocker(Locker locker) {
		this.locker = locker;
	}
	
	public   String   toString() {
		return  "Customer[customerid="+customerid+", customername="+customername+", locker="+locker+"]";
	}


}
