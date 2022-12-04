package Discounts;

import Payment.Payment;
import Services.Services;

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


}
