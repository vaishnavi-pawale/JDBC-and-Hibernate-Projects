package com.Util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.Entity.Adhar;
import com.Entity.Person;

public class HibernateUtil {

	private HibernateUtil() {
	}

	private static SessionFactory sf = null;

	private static StandardServiceRegistry registry = null;

	public static SessionFactory getSessionFactory() {

		if (sf == null) {

			// Connection Properties.

			Map<String, Object> map = new HashMap<String, Object>();
			map.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			map.put(Environment.URL, "jdbc:mysql://localhost:3306/batch5152");
			map.put(Environment.USER, "root");
			map.put(Environment.PASS, "root");

			// hibernate Properties.
			map.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
			map.put(Environment.HBM2DDL_AUTO, "update");
			map.put(Environment.SHOW_SQL, true);

			registry = new StandardServiceRegistryBuilder().applySettings(map).build();

			MetadataSources mds = new MetadataSources(registry).addAnnotatedClass(Person.class)
					.addAnnotatedClass(Adhar.class);

			Metadata md = mds.getMetadataBuilder().build();

			sf = md.getSessionFactoryBuilder().build();

		}

		return sf;

	}

}
