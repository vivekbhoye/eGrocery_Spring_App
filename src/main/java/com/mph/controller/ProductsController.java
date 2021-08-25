//package com.mph.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//
//import com.mph.entity.Products;
//
//@Controller
//public class ProductsController {
////	@Autowired
////	SessionFactory sessionFactory ;
//	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//	Session session = sessionFactory.openSession();
//	Transaction txn;
//	
//	public void addProduct() {
//		txn = session.beginTransaction();
//		
//		Products product = new Products();
//		List<Products> product_List = new ArrayList<Products>();
//		product.setProduct_Name("apple");
//		product.setProduct_Category("Fruits");
//		product.setProduct_Description("red apple fruit from Maharashtra");
//		product.setProduct_Price(500);
//		product.setProduct_Review("very tasty");
//		session.save(product);
//		txn.commit();
//		System.out.println("apple " + product.toString());
//	}
//}
