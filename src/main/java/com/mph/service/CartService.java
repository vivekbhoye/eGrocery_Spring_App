package com.mph.service;

import java.util.List;

import com.mph.entity.Cart;
import com.mph.entity.Products;

public interface CartService {
	
	public void addToCart(Cart cart);
	
 
	
	public List<Products> showCartProducts(int cart_Id);
}
