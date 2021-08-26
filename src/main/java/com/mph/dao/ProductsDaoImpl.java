package com.mph.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Products;
/**
 * 
 * @coauthors Vivek bhoye & Sundar raj
 *
 */
@Repository
public class ProductsDaoImpl implements ProductsDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public ProductsDaoImpl() {
		super();
	}
	/**
	 * 
	 * @return Session
	 */
	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	/**
	 * For adding products
	 * @param product
	 */
	@Override
	public void addProduct(Products product) {
		getSession().save(product);
		System.out.println("Product added to database");
	}
	/**
	 * For getting all Products

	 * @return Products
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Products> getAllProducts() {
		Query query = getSession().createQuery("from Products prods");
		List<Products> products_List = query.list();
		System.out.println(products_List);
		return products_List;
	}
	/**
	 * For getting a Product
	* @param product
	 * @return Product
	 */
	@Override
	public Products getAProduct(Products product) {
		Criteria c = getSession().createCriteria(Products.class);
		c.add(Restrictions.eq("product_Id", product.getProduct_Id()));
		Products prod = (Products) c.uniqueResult();
		System.out.println("Product retrived from database " + prod);
		return prod;
	}
	/**
	 * For updating Products
	 * 
	 * @param Product
	 * @return list of updated Products
	 */
	@Override
	public List<Products> updateProducts(Products product) {
		Query query = getSession().createQuery("update Products prod set product_Name=:product_Name,product_Category=:product_Category, product_img=:product_img, product_Price=:product_Price, product_Review=:product_Review, product_Description=:product_Description where product_Id=:product_Id");
		query.setParameter("product_Name", product.getProduct_Name());
		query.setParameter("product_Category", product.getProduct_Category());
		query.setParameter("product_img", product.getProduct_img());
		query.setParameter("product_Price", product.getProduct_Price());
		query.setParameter("product_Review", product.getProduct_Review());
		query.setParameter("product_Description", product.getProduct_Description());
		query.setParameter("product_Id", product.getProduct_Id());
		int no_Of_Rows = query.executeUpdate();
		if(no_Of_Rows > 0)
		{
			System.out.println("Updated " + no_Of_Rows + " rows");
		}
		return getAllProducts();
	}
	
	@Override
	public List<Products> editProducts(Products product) {
		return null;
	}
	/**
	 * For deleting products
	 * 
	 * @param product_Id
	 * @return list of products after deleting specific products
	 */

	@Override
	public List<Products> deleteProducts(int product_Id) {
		Query query = getSession().createQuery("delete from Products prod where product_Id =:product_Id");
		query.setParameter("product_Id", product_Id);
		int no_Of_Rows = query.executeUpdate();
		if(no_Of_Rows > 0)
		{
			System.out.println("deleted " + no_Of_Rows + " rows");
		} 
		return getAllProducts();
	}
	/**
	 * Searching from Product using product_Id
	 * 
	 * @param product_ID
	 * @return product with that particular productId
	 */
	@Override
	public List<Products> getProductById(int product_Id) {
		Query query = getSession().createQuery("from Products prod where product_Id=:product_Id");
		query.setParameter("product_Id", product_Id);
		return query.list();
	}

}
