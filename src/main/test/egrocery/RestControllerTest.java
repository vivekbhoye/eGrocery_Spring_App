package com.mph.egrocery;
/**
 * 
 * @author Sundar raj
 *
 */
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import com.mph.controller.ProductsRestController;
import com.mph.entity.Products;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


//Unit Testing on a functionality from Rest Controller

public class RestControllerTest {
	
	ProductsRestController prodControl;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		
		System.out.println("Initiating Unit Testing ...");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws java.lang.Exception
	{
		System.out.println("Terminating Unit Testing ...");
	}
	
	@Before
	public void setUp() throws java.lang.Exception
	{
		System.out.println("@Before calling Test method");
		prodControl = new ProductsRestController();
	}
	
	@After
	public void tearDown() throws java.lang.Exception
	{
		prodControl=null;
		System.out.println("@After calling Test method");
	}
	
	@Test
	public void testProductId()
	{
		
		System.out.println("Testing if the returned product and the requested product are the same! ");
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the ID of the product you want to Delete?");
		int prodId=sc.nextInt();
		try {
			ResponseEntity<List<Products>> prodDeleted=prodControl.deleteProduct(prodId);
		try{
			
			ResponseEntity<List<Products>> prod = prodControl.getAProductById(prodId);
			if(((List<Products>) prod).isEmpty())
				System.out.println("Product was deleted successfully!");
			}
		catch(Exception exc){
			System.out.println("Oops!The product could not be deleted!");
		}
		}
		catch(Error e)
		{
			System.out.println("Oops!The product does not exist!");
		}

		finally {
			System.out.println("Product deletion verified Successfully!");
		}
     }
}