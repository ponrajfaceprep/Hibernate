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
		
		String[] phone = {"9898989898", "9999999998"};
		String[] g_mail = {"ponraj@gmail.com", "subhi@gmail.com"};
		String[] city = {"Madurai", "Karur"};
		

	    for(int i = 0; i < n; i++){
	    	
	    	Contact con1 = new Contact();
		    con1.setPhone(phone[i]);
		    con1.setG_mail(g_mail[i]);
		    con1.setCity(city[i]);
		    
	    	Employee e1=new Employee();  
			e1.setId(e_id[i]);
		    e1.setFirstName(f_name[i]);    
		    e1.setLastName(l_name[i]); 
		    
		    e1.setContact(con1); // object
		    
		    session.save(e1);
	    }
	    
		t.commit();
	    System.out.println("successfully saved");    
	    factory.close();  
	    session.close();    
	}
}
