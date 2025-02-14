package com;

public class Department {

	private int departmentId;
	
	private String departmentName;
	
	private int noOfEmployee;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getNoOfEmployee() {
		return noOfEmployee;
	}

	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", noOfEmployee="
				+ noOfEmployee + "]";
	}
	
	
}
