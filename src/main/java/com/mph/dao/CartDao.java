package com.mph.dao;

import java.util.List;

import com.mph.entity.Cart;
import com.mph.entity.Products;

public interface CartDao {
	
	public void addToCart(Cart cart);
	

	
//	public List<Products> showCartProducts(int cart_Id);
	public Cart showCartProducts(int cart_Id);
	
	public Cart deleteCartItems(int cart_Id);
	
	public List<Cart> updateCartItems(Cart cart);
	
}
