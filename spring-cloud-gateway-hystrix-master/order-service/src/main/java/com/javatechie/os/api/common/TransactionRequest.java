package com.javatechie.os.api.common;

import com.javatechie.os.api.entity.Order;


public class TransactionRequest {

    private Order order;
    private Payment payment;
    
	public TransactionRequest(Order order, Payment payment) {
		super();
		this.order = order;
		this.payment = payment;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
}
