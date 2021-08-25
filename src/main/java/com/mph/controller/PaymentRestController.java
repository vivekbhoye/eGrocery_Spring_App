package com.mph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Payment;
import com.mph.service.PaymentService;

@RestController
@RequestMapping(value = "/payment")
@CrossOrigin(origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE },allowCredentials = "true",allowedHeaders = "*")
public class PaymentRestController {
		
	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/savePayment")
	public Payment savePayment(@RequestBody Payment payment) {
		paymentService.savePayment(payment);
		return payment;
	}
	
	
	
}
