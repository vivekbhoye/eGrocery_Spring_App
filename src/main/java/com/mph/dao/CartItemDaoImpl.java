package com.mph.egrocery.dao;
import com.mph.egrocery.entity.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class CartItemDaoImpl implements CartItemDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void addCartItem(Products cartItem) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(cartItem);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void removeCartItem(int CartItemId) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Products cartItem = (Products) session.get(Products.class, CartItemId);
			Cart cart = cartItem.getCart();
			List<Products> cartItems = cart.getProducts();
			cartItems.remove(cartItem);
			session.beginTransaction();
			session.delete(cartItem);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void removeAllCartItems(Cart cart) {
		List<Products> cartItems = cart.getProducts();
		for (Products cartItem : cartItems) {
			removeCartItem(cartItem.getProduct_Id());
		}
	}
}
