package com.javatpoint.myproject;
import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@PrimaryKeyJoinColumn
	
	private int id;
//	@Column(name = "first_name")
	private String firstName;
	
//	@Transient
//	@Column(name = "last_name")
	private String lastName;

	private Contact contact;

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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
