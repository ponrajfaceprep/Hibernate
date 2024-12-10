package com.javatpoint.myproject;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

	@Id
	private int id;
	private String firstName;
	private String dept;
	@OneToOne
	private Laptop lap;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

}
