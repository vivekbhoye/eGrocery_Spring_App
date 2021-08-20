package com.mph.egrocery.dao;

import com.mph.egrocery.entity.*;


public interface CartItemDao {
    void addCartItem(Products cartItem);
    
    void removeCartItem(int CartItemId);
    
    void removeAllCartItems(Cart cart);
}

