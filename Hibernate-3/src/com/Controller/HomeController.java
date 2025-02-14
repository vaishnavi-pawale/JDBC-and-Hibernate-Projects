package com.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Employee;
import com.Util.HibernateUtil;

public class HomeController {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee();
		emp1.setEid(1001);
		emp1.setEname("pranav");
		emp1.setEaddress("pune");
		
		Employee emp2 = new Employee();
		emp2.setEid(1004);
		emp2.setEname("roshnni");
		emp2.setEaddress("mumbai");
		
		Employee emp3 = new Employee();
		emp3.setEid(1003);
		emp3.setEname("pranav");
		emp3.setEaddress("pune");
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session s = sf.openSession();
		
//		s.save(emp2);
//		s.saveOrUpdate(emp3);
//		s.update(emp2);
//		s.delete(emp3);
		
		Employee employee = s.get(Employee.class, 1001);
		System.out.println(employee);
		
		Employee employee1 = s.load(Employee.class, 1001);
		System.out.println(employee1);
		
		s.beginTransaction().commit();
		
		System.out.println("success");
		
	}
}
