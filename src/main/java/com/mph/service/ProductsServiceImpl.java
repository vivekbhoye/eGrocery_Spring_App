package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.ProductsDaoImpl;
import com.mph.entity.Products;
/**
 * 
 * @author Vivek bhoye
 *
 */
@Service
@Transactional
public class ProductsServiceImpl implements ProductsService{
	@Autowired
	ProductsDaoImpl productsDao;
	
	public ProductsServiceImpl() {
		super();
		
	}
	
	@Override
	public void addProduct(Products product) {
		productsDao.addProduct(product);
	}

	@Override
	public List<Products> getAllProducts() {
		return productsDao.getAllProducts();
	}

	@Override
	public Products getAProduct(Products product) {
		return productsDao.getAProduct(product);
	}

	@Override
	public List<Products> updateProducts(Products product) {
		return productsDao.updateProducts(product);
	}

	@Override
	public List<Products> editProducts(Products product) {
		return productsDao.editProducts(product);
	}

	@Override
	public List<Products> deleteProducts(int product_Id) {
		return productsDao.deleteProducts(product_Id);
	}

	@Override
	public List<Products> getProductById(int product_Id) {
		return productsDao.getProductById(product_Id);
	}


}
