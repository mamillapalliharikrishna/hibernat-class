package com.sathya.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CH")
public class Cheque extends Payment {
	private  Long  chequeno;
	private  String  chequetype;
	public Long getChequeno() {
		return chequeno;
	}
	public void setChequeno(Long chequeno) {
		this.chequeno = chequeno;
	}
	public String getChequetype() {
		return chequetype;
	}
	public void setChequetype(String chequetype) {
		this.chequetype = chequetype;
	}
	
	

}
