package com.mph.view;

import java.util.List;
import java.util.Scanner;

import com.mph.egrocery.controller.userController;
import com.mph.egrocery.dao.ProductDao;
import com.mph.egrocery.dao.ProductDaoImpl;

import  com.mph.egrocery.entity.*;

public class MainClass {
    public static void main(String[] args) {
    	
    	Products product=new Products();
    	int productId;
    	Scanner sc = new Scanner(System.in);
    	
    	
    	
    	
    	ProductDao dao=new ProductDaoImpl();

    	//dao.deleteProduct(productId);

    	dao.addProduct(product);
    	
    	  System.out.println("Enter Product id");
    	  productId=sc.nextInt();
    	
    	dao.getProductById(productId);

    	//dao.updateProduct(product);

    	//dao.getAllProducts();
    }
}
