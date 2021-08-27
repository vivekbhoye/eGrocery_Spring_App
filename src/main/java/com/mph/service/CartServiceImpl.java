package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.CartDaoImpl;
import com.mph.entity.Cart;
import com.mph.entity.Products;
/**
 * 
 * @author Vivek bhoye
 *
 */
@Service
@Transactional
public class CartServiceImpl implements CartService{

	@Autowired
	CartDaoImpl cartDao;
	
	@Override
	public void addToCart(Cart cart) {
		cartDao.addToCart(cart);
	}

	

//	@Override
//	public List<Products> showCartProducts(int cart_Id) {
//		// TODO Auto-generated method stub
//		return cartDao.showCartProducts(cart_Id);
//	}
	@Override
	public Cart showCartProducts(int cart_Id) {
		return cartDao.showCartProducts(cart_Id);
	}

}
