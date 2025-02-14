package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Employee;

public class Controller {
public static void main(String[] args) {
	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	
	SessionFactory sf = cfg.buildSessionFactory();
	
	Session s= sf.openSession();
	
	Employee emp = new Employee();
	emp.setEid(103);
	emp.setEname("rutu");
	emp.setEaddress("mumbai");
	emp.setSalary(25264);
	
	Department d = new Department();
	d.setDepartmentId(451);
	d.setDepartmentName("commerce");
	d.setNoOfEmployee(27647);
	
	Company comp = new Company();
	comp.setCid(111);
	comp.setCname("expo");
	comp.setNoOfDepatment(4);
	
	
	s.save(emp);
	s.save(d);
	s.save(comp);
	
	s.beginTransaction().commit();
	System.out.println("success");
	
}
}
