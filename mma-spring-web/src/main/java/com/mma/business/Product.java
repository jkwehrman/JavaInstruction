package com.mma.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String code;
	private String description;
	private double price;
	
	public Product() {
		id=0;
		code="";
		description="";
		price=0.0;
		
	}


	public Product(int id, String code, String description, double price) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.price = price;
	}

	public Product(String inCode, String inDesc, double inPrice) {
		code = inCode;
		description=inDesc;
		price=inPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", description=" + description + ", price=" + price + "]";
	}
	public static void aStaticMethod() {
		System.out.println("an arbitrary static method");
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	} 	
}
