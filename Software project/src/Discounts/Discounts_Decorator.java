package Discounts;

import Payment.Payment;
import Services.Services;

public interface Discounts_Decorator extends Services {
	public void setService(Services s);
	public void setPayment (Payment p);
}
