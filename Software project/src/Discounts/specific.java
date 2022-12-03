package Discounts;

import Payment.Payment;
import Services.Services;

public class specific implements Discounts_Decorator {
	public Services obj = null;
	public double DiscountAmount = 0;
	Payment p = null;

	specific(Services c, double DiscountAmount)
	{
		this.obj = c;
		this.DiscountAmount = DiscountAmount;
	}
	public double pay() {
		return obj.pay()*DiscountAmount;
	}
	public void setPayment(Payment p) {
		// TODO Auto-generated method stub
		this.p = p;
	}
}
