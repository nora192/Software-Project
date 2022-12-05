package Discounts;

import Services.Services;
import Payment.Payment;
import Services.IFormHandler;
public class overall implements Discounts_Decorator {

	Services service;

	double DiscountAmount = 0;

	private Payment p;

	public overall(Services service ,double DiscountAmount)
	{	this.DiscountAmount=DiscountAmount;
		this.service = service;
	}

	public double pay() {
			double pay = service.pay() * (DiscountAmount / 100);
			System.out.println("Paid amount after discount: " + pay + "\n");
			
			return pay;
	}


	public String description() {
		return null;
	}

	public void setHandler(IFormHandler hn) {

	}

	public void setPayment(Payment p) {
		this.p = p;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
