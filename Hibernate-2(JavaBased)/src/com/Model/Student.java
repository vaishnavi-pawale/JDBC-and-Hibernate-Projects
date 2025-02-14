package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Student_Details")
public class Student {

	@Id
	private int sid;
	
	@Column(name = "stu_name")
	private String sname;
	
	@Column(name = "stu_Address")
	private String sAddess;
	
	private String SchoolName;
	
	private String BloodGroup;
	
	private String DOB;
	
	private char Division;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsAddess() {
		return sAddess;
	}
	public void setsAddess(String sAddess) {
		this.sAddess = sAddess;
	}
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	public String getBloodGroup() {
		return BloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public char getDivision() {
		return Division;
	}
	public void setDivision(char division) {
		Division = division;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", sAddess=" + sAddess + ", SchoolName=" + SchoolName
				+ ", BloodGroup=" + BloodGroup + ", DOB=" + DOB + ", Division=" + Division + "]";
	}

}
