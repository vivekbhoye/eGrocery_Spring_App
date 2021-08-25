package com.mph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.PaymentDao;
import com.mph.dao.PaymentDaoImpl;
import com.mph.entity.Payment;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	PaymentDaoImpl paymentDao;
	
	@Override
	public void savePayment(Payment payment) {
		paymentDao.savePayment(payment);
	}

}
