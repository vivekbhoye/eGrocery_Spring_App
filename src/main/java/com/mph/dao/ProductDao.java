package com.mph.egrocery.dao;
import com.mph.egrocery.entity.*;

import java.util.List;



public interface ProductDao {

	Products getProductById(int productId);

	void deleteProduct(int productId);

	void addProduct(Products product);

	void updateProduct(Products product);

	List<Products> getAllProducts();
}
