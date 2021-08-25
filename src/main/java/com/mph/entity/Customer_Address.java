package com.mph.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Customer_Address implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addr_Id;
	private int door_no;
	private String street_name;
	private String city;
	private String state;
	private  int pincode;
	
	@ManyToOne(targetEntity = Customer.class)
	@JoinColumn(name="user_Id", referencedColumnName = "user_Id")
	private Customer customer;

	public Customer_Address() {
		super();
	}

	public Customer_Address(int addr_Id, int door_no, String street_name, String city, String state, int pincode,
			Customer customer) {
		super();
		this.addr_Id = addr_Id;
		this.door_no = door_no;
		this.street_name = street_name;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.customer = customer;
	}

	public int getAddr_Id() {
		return addr_Id;
	}

	public void setAddr_Id(int addr_Id) {
		this.addr_Id = addr_Id;
	}

	public int getDoor_no() {
		return door_no;
	}

	public void setDoor_no(int door_no) {
		this.door_no = door_no;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Customer_Address [addr_Id=" + addr_Id + ", door_no=" + door_no + ", street_name=" + street_name
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode  + "]";
	}

	
	
	
}
