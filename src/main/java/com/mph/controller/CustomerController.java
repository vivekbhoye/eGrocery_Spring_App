//package com.mph.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//import org.springframework.stereotype.Controller;
//
//import com.mph.entity.Cart;
//import com.mph.entity.Customer;
//import com.mph.entity.Customer_Address;
//import com.mph.entity.Customer_Phoneno;
//import com.mph.entity.Login;
//import com.mph.entity.Name;
//import com.mph.entity.Orders;
//import com.mph.entity.Payment;
//import com.mph.entity.Products;
//import com.mph.entity.Seller;
//
//
//@Controller
//public class CustomerController {
//	
//	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//	Session session = sessionFactory.openSession();
//	Transaction txn;
//	
//	public void addCustomer() 
//	{
//		txn = session.beginTransaction();
//		
//		Login login = new Login();
//		login.setUsername("vivek6");
//		login.setUser_Type("customr");
//		login.setPassword("123");
//		session.save(login);
//		
//		
//		Customer customer = new Customer();
//		customer.setUsername("vivek26");
//		customer.setUser_Type("customer");
//		customer.setPassword("1234");
//		
//
//		String fname = "Vivek";
//		String lname = "Bhoye";
//		customer.setName(new Name(fname,lname));
//		
//		Customer_Phoneno customer_phoneno = new Customer_Phoneno();
//		List<Customer_Phoneno> customer_Phoneno_list = new ArrayList<Customer_Phoneno>();
//		customer_phoneno.setCustomer_phoneno(9545848485l);
//		customer_phoneno.setCustomer(customer);
//		customer_Phoneno_list.add(customer_phoneno);
//		session.save(customer_phoneno);
//		customer.setCustomer_phoneno(customer_Phoneno_list);
//		
//		Customer_Address customer_Address = new Customer_Address();
//		List<Customer_Address> customer_Address_List = new ArrayList<Customer_Address>();
//		customer_Address.setCity("Thane");
//		customer_Address.setDoor_no(15);
//		customer_Address.setPincode(410510);
//		customer_Address.setState("Maharashtar");
//		customer_Address.setStreet_name("pokharan");
//		customer_Address.setCustomer(customer);
//		customer_Address_List.add(customer_Address);
//		customer.setCustomer_address(customer_Address_List);
//		session.save(customer_Address);
//		
//		Products product = new Products();
//		List<Products> product_List = new ArrayList<Products>();
//		product.setProduct_Name("iPhone 12 mini");
//		product.setProduct_Description("apple iPhone 12 mini 256 GB");
//		product.setProduct_Price(75000);
//		product.setProduct_Review("best iPhone");
//		product.setProduct_Category("Mobile");
//		product.setCart(null);
//		session.save(product);
//		product_List.add(product);
//		
//		Seller seller = new Seller();
//		seller.setSeller_name("Amazon");
//		seller.setSeller_phoneno(8484546525l);
//		seller.setUsername("amazon26");
//		seller.setUser_Type("seller");
//		seller.setPassword("1234");
//		seller.setProducts(product_List);
//		session.save(seller);
//		product.setSeller(seller);
//		session.save(product);
//		
//		
//		Cart cart = new Cart();
//		cart.setNo_Of_Items(1);
//		cart.setTotal_Amount(75000);
//		cart.setProducts(product_List);
//		session.save(cart);
//		product.setCart(cart);
//		
//
//		Orders orders = new Orders();
//		List<Orders> order_List = new ArrayList<Orders>();
//		orders.setOrder_Status("in progress");
//		orders.setCart(cart);
//		orders.setCustomer(customer);
//		orders.setPayment(null);
//		session.save(orders);
//		
//		cart.setOrders(orders);
//		
//		Payment payment = new Payment();
//		payment.setPayment_Type("card");
//		payment.setTotal_Amount(75000);
//		payment.setOrders(orders);
//		session.save(payment);
//		orders.setPayment(payment);
//		
//		
//		
//		session.save(orders);
//		order_List.add(orders);
//
//		
//		customer.setOrders(order_List);
//		
//		session.save(customer);
//		txn.commit();
//		System.out.println("Customer added Succefully");
//		System.out.println("Name " + customer.getName());
//		System.out.println("addr " + customer.getCustomer_address());
//		System.out.println("phone " + customer.getCustomer_phoneno());
//		System.out.println("product" + product.toString()) ;
//		System.out.println("cart" + cart.toString());
//		System.out.println("payment" + payment.toString());
//		System.out.println("Orders" + orders.toString());
//	}
//	
//}
