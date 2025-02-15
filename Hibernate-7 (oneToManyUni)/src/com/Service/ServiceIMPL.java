package com.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Student;
import com.Entity.Subject;
import com.Util.HibernateUtil;

public class ServiceIMPL implements Service {

	SessionFactory sf = HibernateUtil.getSessionFactory();

	@Override
	public void registerStudentWithSubject() {

		Scanner sc = new Scanner(System.in);
		Session session = sf.openSession();
//		System.out.println("Enter the How many Students you want to add :- ");
//		int n = sc.nextInt();
		List<Subject> listsub = new ArrayList<Subject>();

		Student st = new Student();

		System.out.println("Enter the Student Name :- ");
		st.setSname(sc.next());

		System.out.println("Enter the Student Address :- ");
		st.setSaddress(sc.next());

		System.out.println("how many subjects you want to add :- ");
		int subcnt = sc.nextInt();
		for (int j = 1; j <= subcnt; j++) {

			Subject sub = new Subject();
			System.out.println("Enter the SubjectName :-");
			sub.setSubName(sc.next());

			System.out.println("Enter the Subject Code :- ");
			sub.setSubcode(sc.next());

			listsub.add(sub);

		}
		st.setListsubject(listsub);
		session.save(st);
		session.beginTransaction().commit();
		System.out.println("Student added with Subjects");

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

		Scanner sc = new Scanner(System.in);
		Session session = sf.openSession();

		System.out.println("Entr the StudentID :- ");
		Student student = session.get(Student.class, sc.nextInt());

		if (student != null) {

			System.out.println("Enter the New StudentName :- ");
			student.setSname(sc.next());

			System.out.println("Enter the NewStudent Address :- ");
			student.setSaddress(sc.next());

			session.update(student);
			session.beginTransaction().commit();
			System.out.println("Student updated");

		} else {
			System.out.println("id invalid");
		}

	}

	@Override
	public void updateSubjectDetailsOnly() {
		Scanner sc = new Scanner(System.in);
		Session session = sf.openSession();

		System.out.println("Entr the StudentID :- ");
		Student student = session.get(Student.class, sc.nextInt());
		if (student != null) {

			List<Subject> listsubject = student.getListsubject();
			System.out.println("Which subject you want to update :- ");
			int subjectID = sc.nextInt();
			for (Subject subject : listsubject) {
				if (subject.getSubId() == subjectID) {
					System.out.println("Enter the new Subjectname :- ");
					subject.setSubName(sc.next());

				}
			}

			student.setListsubject(listsubject);
			session.update(student);
			session.beginTransaction().commit();
			System.out.println("Subject updated");

		} else {
			System.out.println("id invalid");
		}

	}

	@Override
	public void deleteStudentOnly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteSubjectOnly() {
		Scanner sc = new Scanner(System.in);
		Session session = sf.openSession();

		System.out.println("Entr the StudentID :- ");
		Student student = session.get(Student.class, sc.nextInt());
		if (student != null) {
			List<Subject> listsubject = student.getListsubject();
			System.out.println("Which subject you want to Delete :- ");
			int subjectID = sc.nextInt();
			Subject sub = null;
			for (Subject subject : listsubject) {

				if (subject.getSubId() == subjectID) {
					sub = subject;
				}
			}

			listsubject.remove(sub);
			student.setListsubject(listsubject);
			session.update(student);
			session.delete(sub);
			session.beginTransaction().commit();
			System.out.println("Subject Deleted");

		} else {
			System.out.println("id invalid");
		}

	}

}
