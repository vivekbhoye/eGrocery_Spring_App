package com.mph.service;

import java.util.List;

import com.mph.entity.Cart;
import com.mph.entity.Products;
/**
 * 
 * @author Vivek bhoye
 *
 */

public interface CartService {
	
	public void addToCart(Cart cart);
	
 
	
//	public List<Products> showCartProducts(int cart_Id);
	public Cart showCartProducts(int cart_Id);



	public void createcartbyid(int product_Id);



	public void deleteCartProductRecords();
}
