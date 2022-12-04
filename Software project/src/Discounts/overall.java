package Discounts;

import Payment.Payment;
import Services.Services;

public class overall implements Discounts_Decorator {
	
	Services service;
	//Payment p;
	double DiscountAmount = 0;

	public overall(Services service ,double DiscountAmount)
	{
		this.DiscountAmount = DiscountAmount;
		this.service = service;
	}


	public double pay() {
		return service.pay() * (DiscountAmount / 100);
	}

}
