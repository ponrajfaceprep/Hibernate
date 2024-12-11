package com.project.App;

public class App {
	public static void main(String[] args) {
		Student st = new Student();
		st.setId(1001);
		st.setFirst_name("Ponraj");
		st.setLast_name("Kannan");
		st.setDepartment("CSE");
		
		System.out.println(st.toString());
		
		// save(st);
	}
}