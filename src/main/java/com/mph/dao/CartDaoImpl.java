package com.mph.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Cart;
import com.mph.entity.Products;

@Repository
public class CartDaoImpl implements CartDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	

	public CartDaoImpl() {
		super();
	}
	
	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	

	@Override
	public void addToCart(Cart cart) {
		getSession().saveOrUpdate(cart);
		System.out.println(" added to cart");
	}



	@Override
	public Cart deleteCartItems(int cart_Id) {

		return null;
	}

	@Override
	public List<Cart> updateCartItems(Cart cart) {
		return null;
	}



	@Override
	public List<Products> showCartProducts(int cart_Id) {
		Query query = getSession().createQuery("from Products prods where cart_Id=:cart_Id");
		query.setParameter("cart_Id", cart_Id);
		List<Products> product_List = query.list();
		return product_List;
	}
	
}
