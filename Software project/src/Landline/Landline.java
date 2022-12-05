package Landline;

import Payment.Payment;
import Services.Services;
import Services.IFormHandler;

public interface Landline extends Services {
	public String name = "";
	public double price = 0;
	public void setPayment (Payment p);
	public void setHandler(IFormHandler Handler);
	public String description ();
	public double pay();

}
