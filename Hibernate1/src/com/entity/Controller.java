package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Controller {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s= sf.openSession();
		
		
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("vaishnavi");
		
		
		s.save(emp);
		
		s.beginTransaction().commit();
		System.out.println("success");
		
		
		
	}
}
