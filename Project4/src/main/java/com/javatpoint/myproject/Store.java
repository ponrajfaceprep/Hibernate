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
		
		int[] id = {1001, 1002};
		String[] f_name = {"Ponraj", "Subhiksha"};
		String[] dept = {"ECE", "CSE"};
		int n = id.length;
		
		int[] lap_id = {1, 2};
		String[] brand = {"Apple", "Asus"};
		String[] model = {"Macbook air", "Zen book"};
		

	    for(int i = 0; i < n; i++){
	    	
	    	Laptop lap = new Laptop();
		    lap.setLap_id(lap_id[i]);
		    lap.setBrand(brand[i]);
		    lap.setModel(model[i]);
		    
	    	Student student=new Student();  
			student.setId(id[i]);
			student.setFirstName(f_name[i]);    
			student.setDept(dept[i]); 
			
			student.setLap(lap);
		    
		    session.save(student);
		    session.save(lap);
	    }
	    
		t.commit();
	    System.out.println("successfully saved");    
	    factory.close();  
	    session.close();    
	}
}
