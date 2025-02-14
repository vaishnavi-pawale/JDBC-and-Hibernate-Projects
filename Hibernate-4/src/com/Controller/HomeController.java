package com.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.Cfg.HibernateCfg;
import com.Entity.Employee;

public class HomeController {

	public static void main(String[] args) {

		SessionFactory sf = HibernateCfg.getConnection();

		Session s = sf.openSession();

		Employee emp = new Employee();
		emp.setEname("rekha");
		emp.setEid(101);
		emp.setEaddress("pune");

		s.save(emp);

		s.beginTransaction().commit();
		System.out.println("success");
	}

}
