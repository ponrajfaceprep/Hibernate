package com.javatpoint.myproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Fetch {
	public static void main(String[] args){
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		Session session1 = factory.openSession();
		Transaction t1 = session1.beginTransaction();
		
		Employee obj = null;
		
		obj = (Employee) session1.get(Employee.class, 1001);
		System.out.println(obj.getFirstName());
		t1.commit();
		
		Session session2 = factory.openSession();
		Transaction t2 = session2.beginTransaction();
		
		obj = (Employee) session2.get(Employee.class, 1001);
		System.out.println(obj.getFirstName());
		t2.commit();
		
	    System.out.println("Success");    
	    factory.close();  
	    session1.close();  
	}
}
