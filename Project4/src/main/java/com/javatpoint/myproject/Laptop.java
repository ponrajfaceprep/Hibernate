package com.javatpoint.myproject;

import javax.persistence.*;

@Entity
@Table(name = "Laptop")
public class Laptop {

	@Id
	private int lap_id;
	private String brand;
	private String model;

	public int getLap_id() {
		return lap_id;
	}

	public void setLap_id(int lap_id) {
		this.lap_id = lap_id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
