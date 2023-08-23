package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cart")
public class CartEntity {
	@Id
	private int id;
	private String brand;
	private String type;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public CartEntity(int id, String type, String brand, int price) {
		super();
		this.id = id;
		this.type = type;
		this.brand = brand;
		this.price = price;
	}
	public CartEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
}
