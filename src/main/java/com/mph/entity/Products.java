package com.mph.entity;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int product_Id;
//	@NotNull
	private String product_Name;
	private String product_Type;
	
	private Blob product_img;
	private int product_Price;
	private String product_Review;
	private String product_Description;
	
	
	@ManyToOne(targetEntity = Cart.class)
	@JoinColumn(name = "cart_Id", referencedColumnName = "cart_Id")
	private Cart cart;
	
	@ManyToOne(targetEntity = Seller.class)
	@JoinColumn(name = "user_Id",referencedColumnName = "user_Id")
	private Seller seller;

	public Products() {
		super();
	}

	public Products(int product_Id, String product_Name, String product_Type, Blob product_img, int product_Price,
			String product_Review, String product_Description, Cart cart, Seller seller) {
		super();
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.product_Type = product_Type;
		this.product_img = product_img;
		this.product_Price = product_Price;
		this.product_Review = product_Review;
		this.product_Description = product_Description;
		this.cart = cart;
		this.seller = seller;
	}

	public int getProduct_Id() {
		return product_Id;
	}

	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public String getProduct_Type() {
		return product_Type;
	}

	public void setProduct_Type(String product_Type) {
		this.product_Type = product_Type;
	}

	public Blob getProduct_img() {
		return product_img;
	}

	public void setProduct_img(Blob product_img) {
		this.product_img = product_img;
	}

	public int getProduct_Price() {
		return product_Price;
	}

	public void setProduct_Price(int product_Price) {
		this.product_Price = product_Price;
	}

	public String getProduct_Review() {
		return product_Review;
	}

	public void setProduct_Review(String product_Review) {
		this.product_Review = product_Review;
	}

	public String getProduct_Description() {
		return product_Description;
	}

	public void setProduct_Description(String product_Description) {
		this.product_Description = product_Description;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	@Override
	public String toString() {
		return "Products [product_Id=" + product_Id + ", product_Name=" + product_Name + ", product_Type="
				+ product_Type + ", product_img=" + product_img + ", product_Price=" + product_Price
				+ ", product_Review=" + product_Review + ", product_Description=" + product_Description  + "]";
	}

	

	
	
	

}
