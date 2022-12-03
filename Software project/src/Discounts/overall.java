package Discounts;

import Payment.Payment;
import Services.Services;

public class overall implements Discounts_Decorator {
	public Services obj = null;
	public double DiscountAmount = 0;
	Payment p = null;

	overall(Services c, double DiscountAmount)
	{
		this.obj = c;
		this.DiscountAmount = DiscountAmount;
	}
	
	public double pay() {
		return obj.pay()*DiscountAmount;
	}
	
	public void setPayment(Payment p) {
		this.p = p;
	}


}
