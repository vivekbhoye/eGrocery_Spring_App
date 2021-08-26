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
/**
 * 
 * @author Vivek bhoye
 *
 */

@RestController
@RequestMapping(value = "/products")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE },allowCredentials = "true",allowedHeaders = "*")
public class ProductsRestController {
	
	@Autowired
	ProductsService productsService;
	/**
	 * For Fetching all products
	  * @param Products
	 * @return
	 * @throws Exception
	 * @return list of products
	 */
	@GetMapping("/allProducts")
	public ResponseEntity<List<Products>> getAllProducts(){
		List<Products> products_List = productsService.getAllProducts();
		System.out.println("From Rest all products : " + products_List);
		
		if (products_List.isEmpty()) {
			return new ResponseEntity<List<Products>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Products>>(products_List,HttpStatus.OK);
		
	}
	/**
	 * For adding new product
	 * @param Products
	 * @return
	 * @throws Exception
	 
	 */
	@PostMapping("/addProduct")
	public Products createProduct(@RequestBody Products product) {
		productsService.addProduct(product);
		System.out.println("product added.");
		return product;
	}
	/**
	 * for updating Product
	 * 
	 * @param Products
	 * @return
	 * @throws Exception
	 */
	
	@PutMapping("/updateProduct")
	public ResponseEntity<List<Products>> update_Product(@RequestBody Products product)
	{
		List<Products> product_List = productsService.updateProducts(product);
		if(product_List.isEmpty()) {
			return new ResponseEntity<List<Products>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Products>>(product_List,HttpStatus.OK);
	}
	/**
	 * for deleting user based on productid
	 * 
	 * @param productid
	 * @return
	 */
	@DeleteMapping("/deleteProduct/{product_Id}")
	public ResponseEntity<List<Products>> deleteProduct(@PathVariable("product_Id") int product_Id){
		List<Products> product_List = productsService.deleteProducts(product_Id);
		if(product_List.isEmpty()) {
			return new ResponseEntity<List<Products>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Products>>(product_List,HttpStatus.OK); 
	}
	/**
	 * Find user by productid
	 * @param products
	 * @return products
	 */
	@GetMapping("/search/{product_Id}")
	public ResponseEntity<List<Products>> getAProductById(@PathVariable("product_Id") int product_Id) {
		List<Products> product_List = productsService.getProductById(product_Id);
		if(product_List.isEmpty()) {
			return new ResponseEntity<List<Products>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Products>>(product_List,HttpStatus.OK);
	}

	
}
