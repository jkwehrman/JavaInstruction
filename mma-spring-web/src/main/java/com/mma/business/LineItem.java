package com.mma.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LineItem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int invoiceID;
	private int productID;
	private int quantity;

	
	public LineItem() {
		id=0;
		invoiceID=0;
		productID=0;
		quantity=0;
	
	}


	public LineItem(int id, int invoiceID, int productID, int quantity) {
		super();
		this.id = id;
		this.invoiceID = invoiceID;
		this.productID = productID;
		this.quantity = quantity;
	}
	
	public LineItem(int inInvoiceID, int inProductID, int inQuantity) {
		invoiceID = inInvoiceID;
		productID = inProductID;
		quantity = inQuantity;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getInvoiceID() {
		return invoiceID;
	}


	public void setInvoiceID(int invoiceID) {
		this.invoiceID = invoiceID;
	}


	public int getProductID() {
		return productID;
	}


	public void setProductID(int productID) {
		this.productID = productID;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "LineItem [id=" + id + ", invoiceID=" + invoiceID + ", productID=" + productID + ", quantity=" + quantity
				+ "]";
	}
	
	public static void aStaticMethod() {
		System.out.println("an arbitrary static method");
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	} 
	
	
}
