package com.sathya.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="CUSTOMER_TAB")
public class Customer {
	@GenericGenerator(name="g1", strategy="foreign",
	  parameters=@Parameter(name="property", value="locker") )
	@Id
	@GeneratedValue(generator="g1")
	private   Integer  customerid;
	@Column(length=15)
	private   String   customername;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
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
