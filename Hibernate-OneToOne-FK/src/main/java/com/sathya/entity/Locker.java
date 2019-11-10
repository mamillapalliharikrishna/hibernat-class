package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOCKER_TAB")
public class Locker {
	@Id
	private  Integer  lockerid;
	
	@Column(length=15)
	private  String  lockertype;
	
	private  Double  rent;

	public Integer getLockerid() {
		return lockerid;
	}

	public void setLockerid(Integer lockerid) {
		this.lockerid = lockerid;
	}

	public String getLockertype() {
		return lockertype;
	}

	public void setLockertype(String lockertype) {
		this.lockertype = lockertype;
	}

	public Double getRent() {
		return rent;
	}

	public void setRent(Double rent) {
		this.rent = rent;
	}
	
	public   String   toString() {
		return  "Locker[lockerid="+lockerid+", lockertype="+lockertype+", rent="+rent+"]";
	}

}
