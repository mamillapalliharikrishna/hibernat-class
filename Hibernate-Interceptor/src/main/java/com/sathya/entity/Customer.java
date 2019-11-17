package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Customer {
	@Id
	private  Integer  id;
	@Column(length=12)
	private  String   name;
	@Column(length=12)
	private  String  address;
	
	@Temporal(TemporalType.TIMESTAMP)
	private  java.util.Date   lastmodified;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public java.util.Date getLastmodified() {
		return lastmodified;
	}

	public void setLastmodified(java.util.Date lastmodified) {
		this.lastmodified = lastmodified;
	}
	
	

}
