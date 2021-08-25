package com.mph.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Payment;

@Repository
public class PaymentDaoImpl implements PaymentDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public PaymentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void savePayment(Payment payment) {
		getSession().saveOrUpdate(payment);
	}

}
