package com.mph.egrocery.dao;
import com.mph.egrocery.entity.*;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.egrocery.entity.Products;

@Repository
public class ProductDaoImpl implements ProductDao {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();	
	Transaction txn ;

	public void addProduct(Products product) {
		txn = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		
		Products newProduct=new Products();

		System.out.println("Product id:"+ newProduct.getProduct_Id());
	
		System.out.println("Enter Product Name");
		String pName = sc.next();
		newProduct.setProduct_Name(pName);
		
		System.out.println("Enter Product Type");
		String pType = sc.next();
		newProduct.setProduct_Category(pType);
		
		System.out.println("Enter Product price");
		int pPrice = sc.nextInt();
		newProduct.setProduct_Price(pPrice);
		
		System.out.println("Enter Product Review");
		String pReview = sc.next();
		newProduct.setProduct_Name(pReview);
		
		System.out.println("Enter Product Desciption");
		String pDescription = sc.next();
		newProduct.setProduct_Description(pDescription);


		session.save(newProduct);		
		
		txn.commit();
		System.out.println("Product Stored Successfully");
	}

	public void deleteProduct(int productId) {
		txn = session.beginTransaction();
	
		try {
			Query query =session.createQuery("delete from Products where product_Id="+productId);  //HQL
			
			int rowCount = query.executeUpdate();
			if (rowCount == 0) {
			System.out.println("No data found to delete");
			} else {
			System.out.println("Your record is deleted");
			}

			} catch (HibernateException e) {
			e.printStackTrace();
			} finally {
			session.close();
			}

	}

	public void updateProduct(Products product) {
		txn = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		

		
		System.out.println("Enter Product Name");
		String pName = sc.next();
		product.setProduct_Name(pName);
		
		System.out.println("Enter Product Type");
		String pType = sc.next();
		product.setProduct_Category(pType);
		
		System.out.println("Enter Product price");
		int pPrice = sc.nextInt();
		product.setProduct_Price(pPrice);
		
		System.out.println("Enter Product Review");
		String pReview = sc.next();
		product.setProduct_Name(pReview);
		
		System.out.println("Enter Product Desciption");
		String pDescription = sc.next();
		product.setProduct_Description(pDescription);

	
		session.saveOrUpdate(product);		
		
		txn.commit();
		System.out.println("Product Updated Successfully");

	}

	public Products getProductById(int productId) {
		txn = session.beginTransaction();
		Criteria c = session.createCriteria(Products.class);
		c.add(Restrictions.eq("product_Id", productId));
		Products product = (Products)c.uniqueResult();
		return product;
	}

	public List<Products> getAllProducts() {
		Query q =session.createQuery("From Products");  //HQL 
		List<Products> plist = q.list();
		
		Iterator itr = plist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		return plist;
	}
	



}