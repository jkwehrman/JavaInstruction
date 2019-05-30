package com.prs.business;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseRequest {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int userID;
	private String description;
	private String justification;
	private Date dateNeeded;
	private String deliveryMode;
	private String status;
	private double total;
	private Date submittedDate;
	private String reasonForRejection;
//	private boolean isActive;
//	private Date dateCreated;
//	private Date dateUpdated;
//	private int updatedByUser;
	
	public PurchaseRequest () {
	id =0;
	userID =0;
	description ="";
	justification ="";
	dateNeeded =null;
	deliveryMode ="";
	status ="";
	total =0.0;
	submittedDate =null;
	reasonForRejection ="";
//	isActive =false;
//	dateCreated =null;
//	dateUpdated =null;
//	updatedByUser =0;
	}


	public PurchaseRequest (int id, int userID, String description, String justification, Date dateNeeded,
			String deliveryMode, String status, double total, Date submittedDate, String reasonForRejection,
			boolean isActive, Date dateCreated, Date dateUpdated, int updatedByUser) {
		super();
		this.id = id;
		this.userID = userID;
		this.description = description;
		this.justification = justification;
		this.dateNeeded = dateNeeded;
		this.deliveryMode = deliveryMode;
		this.status = status;
		this.total = total;
		this.submittedDate = submittedDate;
		this.reasonForRejection = reasonForRejection;
//		this.isActive = isActive;
//		this.dateCreated = dateCreated;
//		this.dateUpdated = dateUpdated;
//		this.updatedByUser = updatedByUser;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getJustification() {
		return justification;
	}


	public void setJustification(String justification) {
		this.justification = justification;
	}


	public Date getDateNeeded() {
		return dateNeeded;
	}


	public void setDateNeeded(Date dateNeeded) {
		this.dateNeeded = dateNeeded;
	}


	public String getDeliveryMode() {
		return deliveryMode;
	}


	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public Date getSubmittedDate() {
		return submittedDate;
	}


	public void setSubmittedDate(Date submittedDate) {
		this.submittedDate = submittedDate;
	}


	public String getReasonForRejection() {
		return reasonForRejection;
	}


	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}



	@Override
	public String toString() {
		return "PurchaseRequest [id=" + id + ", userID=" + userID + ", description=" + description + ", justification="
				+ justification + ", dateNeeded=" + dateNeeded + ", deliveryMode=" + deliveryMode + ", status=" + status
				+ ", total=" + total + ", submittedDate=" + submittedDate + ", reasonForRejection=" + reasonForRejection
				+ "]";
	}
}
