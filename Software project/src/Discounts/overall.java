package Discounts;

import Payment.Payment;
import Services.Services;

public class overall implements Discounts_Decorator {

	Services service;

	double DiscountAmount = 0;

	public overall(Services service ,double DiscountAmount)
	{
		this.DiscountAmount = DiscountAmount;
		this.service = service;
	}

	@Override
	public void setDiscountPrice(double DiscountPrice) {

	}

	@Override
	public double getDiscountPrice() {
		return 0;
	}

//	public double pay() {
//		return service.pay() * (DiscountAmount / 100);
//	}





}
