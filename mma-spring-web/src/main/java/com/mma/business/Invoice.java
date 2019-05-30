package com.mma.business;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Invoice {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int orderNumber;
	private String customerName;
	private LocalDate orderDate;	
	private double total;	
	
	public Invoice() {
		id=0;
		orderNumber=0;
		customerName="";
		orderDate=null;	
		total=0.0;	
		
	}


	public Invoice(int id, int orderNumber, String customerName, LocalDate orderDate, double total) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.total = total;
	}
	public Invoice(int inOrderNumber, String inCustomerName, LocalDate inOrderDate, double inTotal) {
		orderNumber = inOrderNumber; 
		customerName = inCustomerName; 
		orderDate = inOrderDate; 
		total = inTotal;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", orderNumber=" + orderNumber + ", customerName=" + customerName + ", orderDate="
				+ orderDate + ", total=" + total + "]";
	}
	
	public static void aStaticMethod() {
		System.out.println("an arbitrary static method");
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	} 	
	
}
