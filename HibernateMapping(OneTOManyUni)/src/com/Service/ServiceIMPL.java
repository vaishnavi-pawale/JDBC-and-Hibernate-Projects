package com.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Student;
import com.Entity.Subject;
import com.Util.HibernateUtil;

public class ServiceIMPL implements Service{

	SessionFactory sf = HibernateUtil.getConnection();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void registerStudentWithSubject() {
		Session s = sf.openSession();
		
		Student stu = new Student();
		
		System.out.println("Enter the Student Id:- ");
		stu.setSid(sc.nextInt());
		
		System.out.println("Enter Student name:- ");
		stu.setSname(sc.next());
		
		System.out.println("Enter Student Address:- ");
		stu.setSaddress(sc.next());
		
		List<Subject> listSub = new ArrayList<Subject>();
		
		System.out.println("How many subjects do you want to add?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			com.Entity.Subject sub = new com.Entity.Subject();
			System.out.println("Enter the subject name :-");
			sub.setSubName(sc.next());
			
			System.out.println("Enter the subject Code:-");
			sub.setSubCode(sc.next());
			
			listSub.add(sub);
		}
		
		stu.setListsubject(listSub);
		
		s.save(stu);
		s.beginTransaction().commit();
		System.out.println("Student successfully added!!!!!");
		
	}

	@Override
	public void displayStudentDetailsOnly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displaySubjectDetailsOnly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudentDetailsOnly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSubjectDetailsOnly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudentOnly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubjectOnly() {
		// TODO Auto-generated method stub
		
	}

}
