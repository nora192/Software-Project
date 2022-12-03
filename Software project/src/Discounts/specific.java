package Discounts;

import Services.Services;

public class specific implements Discounts_Decorator {
	public Services obj = null;
	public double DiscountAmount = 0;

	specific(Services c, double DiscountAmount)
	{
		this.obj = c;
		this.DiscountAmount = DiscountAmount;
	}
	public double pay() {
		return obj.pay()*DiscountAmount;
	}
}
