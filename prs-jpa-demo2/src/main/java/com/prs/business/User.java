package com.prs.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String userName;
		private String password;
		private String firstName;
		private String lastName;
		private String phoneNumber;
		private String email;
		private boolean isReviewed;
		private boolean isAdmin;
		
		public User() {
		super();
		
		
		}	


		public User(int id, String userName, String password, String firstName, String lastName, String phoneNumber,
				S tring email, boolean isReviewed, boolean isAdmin) {
			super();
			this.id = id;
			this.userName = userName;
			this.password = password;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.isReviewed = isReviewed;
			this.isAdmin = isAdmin;
			
			
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
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


		public String getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public boolean isReviewed() {
			return isReviewed;
		}


		public void setReviewed(boolean isReviewed) {
			this.isReviewed = isReviewed;
		}


		public boolean isAdmin() {
			return isAdmin;
		}


		public void setAdmin(boolean isAdmin) {
			this.isAdmin = isAdmin;
		}


		@Override
		public String toString() {
			return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email + ", isReviewed="
					+ isReviewed + ", isAdmin=" + isAdmin + ", getId()=" + getId() + ", getUserName()=" + getUserName()
					+ ", getPassword()=" + getPassword() + ", getFirstName()=" + getFirstName() + ", getLastName()="
					+ getLastName() + ", getPhoneNumber()=" + getPhoneNumber() + ", getEmail()=" + getEmail()
					+ ", isReviewed()=" + isReviewed() + ", isAdmin()=" + isAdmin() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
	
}
