package com.sathya.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class Card extends Payment {
	private  Long cardno;
	private  String  cardtype;
	public Long getCardno() {
		return cardno;
	}
	public void setCardno(Long cardno) {
		this.cardno = cardno;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	
	

}
