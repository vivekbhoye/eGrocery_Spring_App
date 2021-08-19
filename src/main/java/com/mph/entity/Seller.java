package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seller {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int seller_Id;
	private String seller_name;
	private int seller_phoneno;
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seller(int seller_Id, String seller_name, int seller_phoneno) {
		super();
		this.seller_Id = seller_Id;
		this.seller_name = seller_name;
		this.seller_phoneno = seller_phoneno;
	}
	public int getSeller_Id() {
		return seller_Id;
	}
	public void setSeller_Id(int seller_Id) {
		this.seller_Id = seller_Id;
	}
	public String getSeller_name() {
		return seller_name;
	}
	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}
	public int getSeller_phoneno() {
		return seller_phoneno;
	}
	public void setSeller_phoneno(int seller_phoneno) {
		this.seller_phoneno = seller_phoneno;
	}
	@Override
	public String toString() {
		return "Seller [seller_Id=" + seller_Id + ", seller_name=" + seller_name + ", seller_phoneno=" + seller_phoneno
				+ "]";
	}
	
	
	
}
