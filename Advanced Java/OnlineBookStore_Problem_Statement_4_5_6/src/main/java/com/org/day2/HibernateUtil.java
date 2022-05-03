package com.org.day2;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	static {
		try {
			StandardServiceRegistry registery = new StandardServiceRegistryBuilder().configure("com/org/day2/hibernate.cfg.xml")
					.build();
			Metadata metadata = new MetadataSources(registery).getMetadataBuilder().build();

			sessionFactory = metadata.getSessionFactoryBuilder().build();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}