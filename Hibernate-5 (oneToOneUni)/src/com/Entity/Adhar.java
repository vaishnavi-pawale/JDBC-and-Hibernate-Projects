package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adhar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;

	private String adharNumber;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}

	@Override
	public String toString() {
		return "Adhar [aid=" + aid + ", adharNumber=" + adharNumber + "]";
	}

}
