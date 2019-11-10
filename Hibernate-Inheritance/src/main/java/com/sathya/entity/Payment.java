package com.sathya.entity;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="PAYMENTS")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="PAYMODE", discriminatorType=DiscriminatorType.STRING)
public abstract class Payment {
	@Id
	private  Long  txid;
	
	private  Double  amount;
		
	private  LocalDate   txdate;
	
	public Long getTxid() {
		return txid;
	}
	public void setTxid(Long txid) {
		this.txid = txid;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public LocalDate getTxdate() {
		return txdate;
	}
	public void setTxdate(LocalDate txdate) {
		this.txdate = txdate;
	}
	
	

}
