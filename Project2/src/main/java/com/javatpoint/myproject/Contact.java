package com.javatpoint.myproject;
import javax.persistence.*;

@Embeddable
public class Contact {
	
	private String phone;
	private String g_mail;
	private String city;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getG_mail() {
		return g_mail;
	}
	public void setG_mail(String g_mail) {
		this.g_mail = g_mail;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
