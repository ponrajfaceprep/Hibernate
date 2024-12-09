package com.javatpoint.myproject;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Store {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		
		int[] e_id = {1001, 1002};
		String[] f_name = {"Ponraj", "Subhiksha"};
		String[] l_name = {"Kannan", "Seker"};
		int n = e_id.length;

	    for(int i = 0; i < n; i++){
	    	Employee e1=new Employee();  
			e1.setId(e_id[i]);
		    e1.setFirstName(f_name[i]);    
		    e1.setLastName(l_name[i]); 
		    session.save(e1);
	    }
	    
		t.commit();
	    System.out.println("successfully saved");    
	    factory.close();  
	    session.close();    
	}
}
