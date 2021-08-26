package com.mph.dao;

import java.util.List;

import com.mph.entity.Products;
/**
 * 
 * @author Vivek bhoye
 *
 */

public interface ProductsDao {
	
	public void addProduct(Products product);
	
	public List<Products> getAllProducts();
	
	public Products getAProduct(Products product);
	
	public List<Products> updateProducts(Products product);
	
	public List<Products> editProducts(Products product);
	
	public List<Products> deleteProducts(int product_Id);
	
	public List<Products> getProductById(int product_Id);

}
