package com.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;

	private String sname;

	private String saddress;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Subject> listsubject = new ArrayList<Subject>();

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public List<Subject> getListsubject() {
		return listsubject;
	}

	public void setListsubject(List<Subject> listsubject) {
		this.listsubject = listsubject;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", listsubject=" + listsubject
				+ "]";
	}

}
