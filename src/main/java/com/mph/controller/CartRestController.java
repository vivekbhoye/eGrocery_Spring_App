package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Cart;
import com.mph.entity.Products;
import com.mph.service.CartService;
import com.mph.service.CartServiceImpl;
/**
 * 
 * @author Vivek bhoye
 *
 */

@RestController
@RequestMapping(value="/cart")
@CrossOrigin(origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE },allowCredentials = "true",allowedHeaders = "*")
public class CartRestController {

		@Autowired
		CartService cartService;
//		public ResponseEntity<List<Cart>> showCartItems(@PathVariable("cart_Id") int cart_Id){
		/**
		 * For fetching cart items by cart id
		 
		 * @return cart items
		 */
		@GetMapping("/showCartItems/{cart_Id}")
		public Cart showCartItems(@PathVariable("cart_Id") int cart_Id){
			Cart cart = cartService.showCartProducts(cart_Id);
			System.out.println("till here");
			return cart;
		}
		/**
		 * For Creating cart
		 
		 */
		
		@PostMapping("/createCart")
		public Cart createCart(@RequestBody(required = false) Cart cart) {
			cartService.addToCart(cart);
			return cart;
		}
		
		@GetMapping("/createCart/{product_Id}")
		public void createcartbyid(@PathVariable("product_Id") int product_Id){
			cartService.createcartbyid(product_Id);
			
		}
		
		@DeleteMapping("/deleteCartProductRecords")
		public void deleteCartProductRecords() {
			cartService.deleteCartProductRecords();
		}
}
