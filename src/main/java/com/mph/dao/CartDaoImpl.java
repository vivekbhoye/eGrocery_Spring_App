package com.mph.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mph.entity.Cart;
import com.mph.entity.Products;
/**
 * 
 * @author Vivek bhoye
 *
 */
@Repository
public class CartDaoImpl implements CartDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	

	public CartDaoImpl() {
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
	 * For adding to cart
	 * @param cart
	 */

	@Override
	public void addToCart(Cart cart) {
		getSession().saveOrUpdate(cart);
		System.out.println(" added to cart");
	}

	/**
	 * For deleting cart items using cart id
	 * 
	 * @param cart_Id
	 * @return list of cart items after deleting specific product from cart items
	 */

	@Override
	public Cart deleteCartItems(int cart_Id) {

		return null;
	}
	/**
	 * For updating cart items
	 * 
	 * @param cart
	 * @return list of updated cart items
	 */
	@Override
	public List<Cart> updateCartItems(Cart cart) {
		return null;
	}
	/**
	 * For getting all cart items
	 * @param cart_Id
	 * @return cart items
	 */


	@Override
	public Cart showCartProducts(int cart_Id) {
		
		Criteria c = getSession().createCriteria(Cart.class);
		c.add(Restrictions.eq("cart_Id", cart_Id));
		Cart cart = (Cart) c.uniqueResult();
		System.out.println("Cart retrived from database " + cart);
		return cart;
		
//		Query query = getSession().createQuery("from Cart cart where cart_Id=:cart_Id");
//		query.setParameter("cart_Id", cart_Id);
//		Cart cart = query.list();
//		int no_Of_Rows = query.executeUpdate();
//		if(no_Of_Rows > 0)
//		{
//			System.out.println("deleted " + no_Of_Rows + " rows");
//		} 
////		List<Products> product_List = query.list();
//		return product_List;
	}
	
//	@Override
//	public List<Products> showCartProducts(int cart_Id) {
//		Query query = getSession().createQuery("from Products prods where cart_Id=:cart_Id");
//		query.setParameter("cart_Id", cart_Id);
//		List<Products> product_List = query.list();
//		return product_List;
//	}
//	
}
