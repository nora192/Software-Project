package Discounts;

import Payment.Payment;
import Services.Services;

public class specific implements Discounts_Decorator {

	Services service;
	double DiscountAmount;
	public specific(Services service )
	{
		this.service = service;
	}

	public void setDiscountPrice(double DiscountAmount) {
		double temp =this.service.getDiscountPrice();
		temp += DiscountAmount/100;
		this.service.setDiscountPrice( temp );
	}


	public double getDiscountPrice() {
		return 0;
	}
//
//	public double pay() {
//		return service.pay() * (DiscountAmount / 100);
//	}
//

}
