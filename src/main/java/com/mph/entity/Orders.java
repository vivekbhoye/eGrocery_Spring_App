package com.mph.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;
/**
 * 
 * @author Vivek bhoye
 *
 */
@Entity
public class Orders implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int order_Id;
	
	private String order_Status;
	
	@ManyToOne
	@JoinColumn(name = "user_Id",referencedColumnName = "user_Id")
	private Customer customer;
	
	@OneToOne
	private Cart cart;
	
	@OneToOne
	private Payment payment;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int order_Id, String order_Status, Customer customer, Cart cart, Payment payment) {
		super();
		this.order_Id = order_Id;
		this.order_Status = order_Status;
		this.customer = customer;
		this.cart = cart;
		this.payment = payment;
	}

	public int getOrder_Id() {
		return order_Id;
	}

	public void setOrder_Id(int order_Id) {
		this.order_Id = order_Id;
	}

	public String getOrder_Status() {
		return order_Status;
	}

	public void setOrder_Status(String order_Status) {
		this.order_Status = order_Status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Orders [order_Id=" + order_Id + ", order_Status=" + order_Status  + "]";
	}

	
	
	
	
}
