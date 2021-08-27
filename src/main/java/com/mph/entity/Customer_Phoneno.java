package com.mph.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 * 
 * @author Vivek bhoye
 *
 */
@Entity
public class Customer_Phoneno implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int phoneno_Id;
	private long customer_phoneno;
	
	@ManyToOne(targetEntity = Customer.class)
	@JoinColumn(name="user_Id",referencedColumnName = "user_Id")
	private Customer customer;
	

	public Customer_Phoneno() {
		super();
	}


	public Customer_Phoneno(int phoneno_Id, long customer_phoneno, Customer customer) {
		super();
		this.phoneno_Id = phoneno_Id;
		this.customer_phoneno = customer_phoneno;
		this.customer = customer;
	}


	public int getPhoneno_Id() {
		return phoneno_Id;
	}


	public void setPhoneno_Id(int phoneno_Id) {
		this.phoneno_Id = phoneno_Id;
	}


	public long getCustomer_phoneno() {
		return customer_phoneno;
	}


	public void setCustomer_phoneno(long customer_phoneno) {
		this.customer_phoneno = customer_phoneno;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Customer_Phoneno [phoneno_Id=" + phoneno_Id + ", customer_phoneno=" + customer_phoneno + "]";
	}


		
}
