package com;

public class Company {

	private int cid;
	
	private String cname;
	
	private int noOfDepatment;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getNoOfDepatment() {
		return noOfDepatment;
	}

	public void setNoOfDepatment(int noOfDepatment) {
		this.noOfDepatment = noOfDepatment;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", noOfDepatment=" + noOfDepatment + "]";
	}
	
}
