package com.mph.egrocery;
/**
 * 
 * @author Sundar raj
 *
 */
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.mph.dao.ProductsDao;
import com.mph.dao.ProductsDaoImpl;
import com.mph.entity.Products;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule
//Unit Testing on a functionality from DAO layer(ProdDaoImpl)

public class ProductTest {
	
	ProductsDao prod;
	
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
		prod = new ProductsDaoImpl();
	}
	
	@After
	public void tearDown() throws java.lang.Exception
	{
		prod=null;
		System.out.println("@After calling Test method");
	}
	
	@Test
	public void testProductId()
	{
		System.out.println("Testing if the returned product and the requested product are the same! ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an existing Product ID");
		int prodId=sc.nextInt();
		try {
		Products prodReturned=prod.getProductById(prodId);
		assertEquals(prodReturned.getProduct_Id(), prodId);
		}
		catch(Exception e)
		{
			System.out.println("Oops!The product does not exist!");
		}

		finally {
			System.out.println("Product Id verified Successfully!");
		}
     }
}