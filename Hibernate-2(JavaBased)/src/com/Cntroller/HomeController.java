package com.Cntroller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Model.Student;
import com.Util.HibernateUtil;

public class HomeController {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getConnection();

		Session s = sf.openSession();

		Student st = new Student();
		st.setSid(101);
		st.setSname("vaishanvi");
		st.setSchoolName("BVP");
		st.setsAddess("Pune");
		st.setDOB("27-11-2004");
		st.setDivision('A');
		st.setBloodGroup("A+");

		s.save(st);
		
		s.beginTransaction().commit();
		System.out.println("success");
	}
}
