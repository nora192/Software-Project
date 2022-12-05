package Discounts;

import Services.Services;
import Services.IFormHandler;
public class overall implements Discounts_Decorator {

	Services service;

	double DiscountAmount = 0;

	public overall(Services service ,double DiscountAmount)
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

	public void setHandler(IFormHandler hn) {

	}



}
