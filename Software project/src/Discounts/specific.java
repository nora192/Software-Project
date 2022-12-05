package Discounts;

import Payment.Payment;
import Services.Services;
import Services.IFormHandler;
public class specific implements Discounts_Decorator {

	double DiscountAmount = 0;
	Services service;

	public specific(Services service ,double DiscountAmount)
	{	this.DiscountAmount=DiscountAmount;
		this.service = service;
	}


	public double pay() {
		return service.pay() * (DiscountAmount / 100);
	}

	@Override
	public String description() {
		return null;
	}

	@Override
	public void setHandler(IFormHandler hn) {

	}


}
