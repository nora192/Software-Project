package Discounts;

import Payment.Payment;
import Services.Services;
import Services.IFormHandler;
public class specific implements Discounts_Decorator {

	double DiscountAmount = 0;
	Services service;
	private Payment p;

	public specific(Services service ,double DiscountAmount)
	{	this.DiscountAmount=DiscountAmount;
		this.service = service;
	}


	public double pay() {
		return service.pay() * (DiscountAmount / 100);
	}

	
	public String description() {
		return null;
	}
	
	public void setPayment(Payment p) {
		this.p = p;
	}

	
	public void setHandler(IFormHandler hn) {

	}


	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}


}
