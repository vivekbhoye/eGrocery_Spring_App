package com.mph.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_Id;
	
	@Column(name="Full_Name")
	@Embedded
	private Name name;
	
	@OneToMany(mappedBy = "customer")
	private List<Customer_Phoneno> customer_phoneno;
	
	@OneToMany(mappedBy = "customer")
	private List<Customer_Address> customer_address;
	
//	@OneToMany(mappedBy = "customer")
//	private List<Products> products;
	
	@OneToMany(mappedBy = "customer")
	private List<Orders> orders;
	


	public Customer() {
		super();
	}



	public Customer(int user_Id, Name name, List<Customer_Phoneno> customer_phoneno,
			List<Customer_Address> customer_address, List<Orders> orders) {
		super();
		this.user_Id = user_Id;
		this.name = name;
		this.customer_phoneno = customer_phoneno;
		this.customer_address = customer_address;
		this.orders = orders;
	}



	public int getUser_Id() {
		return user_Id;
	}



	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}



	public Name getName() {
		return name;
	}



	public void setName(Name name) {
		this.name = name;
	}



	public List<Customer_Phoneno> getCustomer_phoneno() {
		return customer_phoneno;
	}



	public void setCustomer_phoneno(List<Customer_Phoneno> customer_phoneno) {
		this.customer_phoneno = customer_phoneno;
	}



	public List<Customer_Address> getCustomer_address() {
		return customer_address;
	}



	public void setCustomer_address(List<Customer_Address> customer_address) {
		this.customer_address = customer_address;
	}



	public List<Orders> getOrders() {
		return orders;
	}



	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}



	@Override
	public String toString() {
		return "Customer [user_Id=" + user_Id + ", name=" + name + ", customer_phoneno=" + customer_phoneno
				+ ", customer_address=" + customer_address + ", orders=" + orders + "]";
	}


}
