package com.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.Entity.Adhar;
import com.Entity.Person;
import com.Util.HibernateUtil;

public class ServiceIMPL implements Service {

	SessionFactory sf = HibernateUtil.getSessionFactory();

	@Override
	public void registerPersonWithAdhar() {
		Scanner sc = new Scanner(System.in);
		Session session = sf.openSession();
		System.out.println("How many Persons You want to add :- ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			Person p = new Person();
			System.out.println("Enter the Person Name :- ");
			p.setPname(sc.next());

			System.out.println("ENter the Person Address :- ");
			p.setPaddress(sc.next());

			Adhar ad = new Adhar();
			System.out.println("Enter the Adhar Number :- ");
			ad.setAdharNumber(sc.next());

			p.setAdhar(ad);

			session.save(p);

			session.beginTransaction().commit();
			System.out.println("Person added with adhar");

		}

	}

	@Override
	public void displayPersonDetailsOnly() {
		Scanner sc = new Scanner(System.in);
		Session session = sf.openSession();
		Query query = session.createQuery("select pid,pname,paddress from Person");
		List<Object[]> allPersons = query.getResultList();
		for (Object[] objects : allPersons) {
			System.out.println(Arrays.toString(objects));
		}

	}

	@Override
	public void displayAdharDetailsOnly() {
		// TODO Auto-generated method stub

//		Homework

	}

	@Override
	public void updatePersonDetailsOnly() {
		Scanner sc = new Scanner(System.in);
		Session session = sf.openSession();
		System.out.println("Enter the PersonID :- ");
		Person person = session.get(Person.class, sc.nextInt());

		if (person != null) {

			System.out.println("----Before updated------");

			System.out.println(person);

			System.out.println("Ente the new name :- ");
			person.setPname(sc.next());

			System.out.println("Enter the address :- ");
			person.setPaddress(sc.next());

			session.update(person);
			session.beginTransaction().commit();
			System.out.println("Person updated");

			System.out.println("----After updated------");

			Person person1 = session.get(Person.class, sc.nextInt());
			System.out.println(person1);

		} else {
			System.out.println("Id Doesnot exit");
		}

	}

	@Override
	public void updateAdharDetailsOnly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePersonOnly() {

		Scanner sc = new Scanner(System.in);
		Session session = sf.openSession();
		System.out.println("Enter the PersonID :- ");
		Person person = session.get(Person.class, sc.nextInt());

		if (person != null) {

			person.setAdhar(null);
			session.update(person);
			session.delete(person);
			session.beginTransaction().commit();
			System.out.println("Person Deleted");

		} else {
			System.out.println("Id Doesnot exit");
		}

	}

	@Override
	public void deleteAdharOnly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePersonWithAdhar() {
		// TODO Auto-generated method stub

	}

}
