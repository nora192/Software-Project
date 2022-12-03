package Discounts;

import Services.Services;

public class overall implements Discounts_Decorator {
	public Services obj = null;
	public double DiscountAmount = 0;

	overall(Services c, double DiscountAmount)
	{
		this.obj = c;
		this.DiscountAmount = DiscountAmount;
	}
	public double pay() {
		return obj.pay()*DiscountAmount;
	}


}
