package com.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@javax.persistence.Entity
@Table(name = "Employee_Table")
public class Employee {

	@Id
	private int eid;

	@Column(name = "Emp_Name")
	private String ename;

	@Column(name = "Emp_Address")
	private String eaddress;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
	}
	
	

}
