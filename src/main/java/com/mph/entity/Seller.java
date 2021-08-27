package com.mph.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 * 
 * @author Vivek bhoye
 *
 */
@Entity
public class Seller extends Login {

//	@Id  
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int seller_Id;
	private String seller_name;
	
	private long seller_phoneno;
	
	@OneToMany(mappedBy = "seller")
	private List<Products> products;
	
	public Seller() {
		super();
	}

	public Seller(String seller_name, long seller_phoneno, List<Products> products) {
		super();
		this.seller_name = seller_name;
		this.seller_phoneno = seller_phoneno;
		this.products = products;
	}

	public String getSeller_name() {
		return seller_name;
	}

	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}

	public long getSeller_phoneno() {
		return seller_phoneno;
	}

	public void setSeller_phoneno(long seller_phoneno) {
		this.seller_phoneno = seller_phoneno;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Seller [seller_name=" + seller_name + ", seller_phoneno=" + seller_phoneno + "]";
	}

	

	

}
