package com.mph.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Payment implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int payment_Id;
	
	private String payment_Type;
	private int total_Amount;
	private String fullName;
	private String email;
//	@Lob
	private String Address;
	private String city;
	private String state;
	
	private String nameOnCard;
	
	
	@OneToOne
	private Orders orders;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(int payment_Id, String payment_Type, int total_Amount, String fullName, String email, String address,
			String city, String state, String nameOnCard, Orders orders) {
		super();
		this.payment_Id = payment_Id;
		this.payment_Type = payment_Type;
		this.total_Amount = total_Amount;
		this.fullName = fullName;
		this.email = email;
		Address = address;
		this.city = city;
		this.state = state;
		this.nameOnCard = nameOnCard;
		this.orders = orders;
	}

	public int getPayment_Id() {
		return payment_Id;
	}

	public void setPayment_Id(int payment_Id) {
		this.payment_Id = payment_Id;
	}

	public String getPayment_Type() {
		return payment_Type;
	}

	public void setPayment_Type(String payment_Type) {
		this.payment_Type = payment_Type;
	}

	public int getTotal_Amount() {
		return total_Amount;
	}

	public void setTotal_Amount(int total_Amount) {
		this.total_Amount = total_Amount;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Payment [payment_Id=" + payment_Id + ", payment_Type=" + payment_Type + ", total_Amount=" + total_Amount
				+ ", fullName=" + fullName + ", email=" + email + ", Address=" + Address + ", city=" + city + ", state="
				+ state + ", nameOnCard=" + nameOnCard + "]";
	}

	
	
}
