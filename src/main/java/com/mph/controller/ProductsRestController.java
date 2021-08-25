package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Products;
import com.mph.service.ProductsService;

@RestController
@RequestMapping(value = "/products")
@CrossOrigin(origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE },allowCredentials = "true",allowedHeaders = "*")
public class ProductsRestController {
	
	@Autowired
	ProductsService productsService;
	
	@GetMapping("/allProducts")
	public ResponseEntity<List<Products>> getAllProducts(){
		List<Products> products_List = productsService.getAllProducts();
		System.out.println("From Rest all products : " + products_List);
		
		if (products_List.isEmpty()) {
			return new ResponseEntity<List<Products>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Products>>(products_List,HttpStatus.OK);
		
	}
	
	@PostMapping("/addProduct")
	public Products createProduct(@RequestBody Products product) {
		productsService.addProduct(product);
		System.out.println("product added.");
		return product;
	}
	
	@PutMapping("/updateProduct")
	public ResponseEntity<List<Products>> update_Product(@RequestBody Products product)
	{
		List<Products> product_List = productsService.updateProducts(product);
		if(product_List.isEmpty()) {
			return new ResponseEntity<List<Products>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Products>>(product_List,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteProduct/{product_Id}")
	public ResponseEntity<List<Products>> deleteProduct(@PathVariable("product_Id") int product_Id){
		List<Products> product_List = productsService.deleteProducts(product_Id);
		if(product_List.isEmpty()) {
			return new ResponseEntity<List<Products>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Products>>(product_List,HttpStatus.OK); 
	}
	
	@GetMapping("/search/{product_Id}")
	public ResponseEntity<List<Products>> getAProductById(@PathVariable("product_Id") int product_Id) {
		List<Products> product_List = productsService.getProductById(product_Id);
		if(product_List.isEmpty()) {
			return new ResponseEntity<List<Products>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Products>>(product_List,HttpStatus.OK);
	}

	
}
