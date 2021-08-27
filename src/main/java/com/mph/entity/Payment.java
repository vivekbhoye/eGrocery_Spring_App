package com.mph.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
/**
 * 
 * @author Vivek bhoye
 *
 */
@Entity
public class Payment implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int payment_Id;
	
	private String payment_Type;
	private int total_Amount;
	
	@OneToOne
	private Orders orders;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int payment_Id, String payment_Type, int total_Amount, Orders orders) {
		super();
		this.payment_Id = payment_Id;
		this.payment_Type = payment_Type;
		this.total_Amount = total_Amount;
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

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Payment [payment_Id=" + payment_Id + ", payment_Type=" + payment_Type + ", total_Amount=" + total_Amount
				 + "]";
	}

	
	
	
}
