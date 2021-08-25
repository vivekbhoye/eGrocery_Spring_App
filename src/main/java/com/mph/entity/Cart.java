package com.mph.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cart_Id;
	
	private int no_Of_Items;
	private int total_Amount;
	
	@OneToMany
	private List<Products> products;
	
	@OneToOne
	private Orders orders;
	

	public Cart() {
		super();
	}

	public Cart(int cart_Id, int no_Of_Items, int total_Amount, List<Products> products, Orders orders) {
		super();
		this.cart_Id = cart_Id;
		this.no_Of_Items = no_Of_Items;
		this.total_Amount = total_Amount;
		this.products = products;
		this.orders = orders;
	}

	public int getCart_Id() {
		return cart_Id;
	}

	public void setCart_Id(int cart_Id) {
		this.cart_Id = cart_Id;
	}

	public int getNo_Of_Items() {
		return no_Of_Items;
	}

	public void setNo_Of_Items(int no_Of_Items) {
		this.no_Of_Items = no_Of_Items;
	}

	public int getTotal_Amount() {
		return total_Amount;
	}

	public void setTotal_Amount(int total_Amount) {
		this.total_Amount = total_Amount;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Cart [cart_Id=" + cart_Id + ", no_Of_Items=" + no_Of_Items + ", total_Amount=" + total_Amount + "]";
	}


	
	
	
	
	

}
